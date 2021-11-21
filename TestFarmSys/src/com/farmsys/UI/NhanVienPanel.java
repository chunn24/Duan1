/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.NhanVien;
import com.farmsys.Helper.Auth;
import com.farmsys.Helper.MailHelper;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.NhanVienDAO;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.IOException;
import java.util.EnumMap;
import java.util.UUID;

/**
 *
 * @author NguyenTrung
 */
public class NhanVienPanel extends javax.swing.JPanel {

    private String manv;
    private String emailNV;
    private String tempOTP;
    String QRcoderandomString;

    public NhanVienPanel() {
        initComponents();
        init();
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }

    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;

    void init() {
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Chưa đăng nhập, vô cái loz");
            System.exit(0);
        }
        this.updateStatus();
        new Timer(10000, (ActionEvent e) -> {
            this.fillTable();
        }).start();

    }

    void insert() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Không có quyền xóa nhân viên!");
        } else {
            if (timKiemNhanVien() != 1) {
                NhanVien nv = getForm();
                String mk2 = new String(txtMatKhau2.getPassword());
                if (!mk2.equals(nv.getMatKhau())) {
                    MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
                } else {
                    try {

                        this.createQRcode();
                        dao.insert(nv);
                        this.fillTable();
                        MsgBox.alert(this, "Thêm mới thành công!");
                        this.Sendmail();
                    } catch (Exception e) {
                        MsgBox.alert(this, "Thêm thất bại!");
                        System.out.println(e);
                    }
                }
            }
        }
    }

    void update() {
        NhanVien nv = getForm();
        String mk2 = new String(txtMatKhau2.getPassword());
        if (!mk2.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                this.createQRcode();
                dao.update(nv);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công!");
                this.Sendmail();
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
                System.out.println(e);
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Không có quyền xóa nhân viên!");
        } else {
            String manv = txtMaNV.getText();
            System.out.println(Auth.user.getMaNV());
            System.out.println(manv);
            if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính bạn!");
            } else if (MsgBox.confirm(this, "bạn thực sự muốn xóa nhân viên này?")) {
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                    System.out.println(e);
                }
            }
        }
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nv = dao.selectById(manv);
        this.setForm(nv);      
        this.updateStatus();

    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblNhanVien.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblNhanVien.getColumnCount() - 1;
        this.edit();
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {

                Object[] row = {
                    nv.getMaNV(), "***********", nv.getHoTen(),
                    nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên",
                    nv.getEmail(), nv.isGioiTinh() ? "Nam" : "Nữ", nv.getLuong()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau.setText(nv.getMatKhau());
        txtMatKhau2.setText(nv.getMatKhau());
        rdoTruongPhong.setSelected(nv.isVaiTro());
        rdoNhanVien.setSelected(!nv.isVaiTro());

        rdoNam.setSelected(nv.isGioiTinh());
        rdoNu.setSelected(!nv.isGioiTinh());
        txtEmail.setText(nv.getEmail());
        txtLuong.setText(nv.getLuong() + "");
    }

    NhanVien getForm() {
        if (validation()) {
            NhanVien nv = new NhanVien();
            nv.setMaNV(txtMaNV.getText());
            nv.setHoTen(txtHoTen.getText());
            nv.setMatKhau(new String(txtMatKhau.getPassword()));
            nv.setVaiTro(rdoTruongPhong.isSelected());
            //xét giới tính

            nv.setGioiTinh(rdoNam.isSelected());
            nv.setEmail(txtEmail.getText());
            nv.setLuong(Integer.parseInt(txtLuong.getText()));
            nv.setQRcodeString(txtqrcode.getText());
            return nv;
        }
        return null;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getColumnCount() - 1);
        //Trạng thái form
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

    }

    private void randomString() {
        QRcoderandomString = UUID.randomUUID().toString();
        txtqrcode.setText(QRcoderandomString);
    }

    private void createQRcode() {
        try {
            String qrCodeData = QRcoderandomString;
            String filePath = "src\\QRcode\\a.png";
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map< EncodeHintType, ErrorCorrectionLevel> hintMap = new EnumMap< EncodeHintType, ErrorCorrectionLevel>(EncodeHintType.class);
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(qrCodeData.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                    .lastIndexOf('.') + 1), new File(filePath));
            System.out.println("QR Code image created successfully!");
        } catch (WriterException | IOException e) {
            System.err.println(e);
        }
    }

    void Sendmail() {
        String body = "Đây là mã QR code cá nhân. Vui lòng không để cho người khác có được mã này !";
        try {
            manv = txtMaNV.getText();
            NhanVien nhanVien = dao.selectById(manv);
            if (nhanVien != null) {//check tk có tồn tại không
                emailNV = dao.selectById(manv).getEmail();//check mail nv
                if (emailNV == null) {
                    MsgBox.alert(this, "Tài khoản này chưa có email");
                } else {//tài khoản có mail --> gửi mail -->check otp
                    MailHelper.sendFile(emailNV, "QRCode to FarmSys", body, "src\\QRCODE\\a.png");

                }
            } else {
                MsgBox.alert(this, "Tài khoản không tồn tại");
            }
        } catch (Exception e) {
        }
    }

    private boolean validation() {
        if (txtMaNV.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập mã nhân viên!");
            txtMaNV.requestFocus();
            return false;
        }
        if (txtMatKhau.getPassword().toString().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập mật khẩu!");
            txtMatKhau.requestFocus();
            return false;
        }
        if (txtMatKhau2.getPassword().toString().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập xác nhận mật khẩu!");
            txtMatKhau2.requestFocus();
            return false;
        }
        if (txtHoTen.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập họ tên nhân viên!");
            txtHoTen.requestFocus();
            return false;
        }
        if (txtEmail.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập email!");
            txtEmail.requestFocus();
            return false;
        }
        if (txtLuong.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập lương!");
            txtLuong.requestFocus();
            return false;
        }

        if (!txtMatKhau2.getText().equals(txtMatKhau.getText())) {
            MsgBox.alert(this, txtMatKhau.getText());
            MsgBox.alert(this, "Xác nhận mật khẩu không chính xác!");
            txtMatKhau2.requestFocus();
            return false;
        }

        //kiểm tra tính hợp lệ đữ liệu bằng biểu thức chính quy
        if (!(txtEmail.getText().matches("\\w+@\\w+\\.\\w+"))) {
            MsgBox.alert(this, "Bạn nhập sai định dạng email!");
            txtEmail.requestFocus();
            return false;
        }

        return true;
    }

    //trả về vị trí tìm thấy sinh viên
    public int timKiemNhanVien() {
        for (int i = 0; i < dao.selectAll().size(); i++) {
            if (txtMaNV.getText().equals(dao.selectAll().get(i).getMaNV())) {
                MsgBox.alert(this, "Mã nhân viên đã tồn tại!");
                txtMaNV.requestFocus();
                return i;
            } else if (txtEmail.getText().equals(dao.selectAll().get(i).getEmail())) {
                MsgBox.alert(this, "Email đã tồn tại!");
                txtEmail.requestFocus();
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlTong = new javax.swing.JPanel();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        pnlEdit = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblMatKhau2 = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhau2 = new javax.swing.JPasswordField();
        txtHoTen = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtqrcode = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTong.setBackground(new java.awt.Color(255, 255, 255));
        pnlTong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 255, 102))); // NOI18N
        pnlTong.setMinimumSize(new java.awt.Dimension(1083, 750));
        pnlTong.setPreferredSize(new java.awt.Dimension(1083, 750));
        pnlTong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNhanVien.setAutoCreateRowSorter(true);
        tblNhanVien.setBackground(new java.awt.Color(204, 255, 204));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NHÂN VIÊN", "MẬT KHẨU", "HỌ VÀ TÊN", "VAI TRÒ", "EMAIL", "GIỚI TÍNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        pnlList.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 250));

        pnlTong.add(pnlList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1030, 250));

        pnlEdit.setBackground(new java.awt.Color(255, 255, 255));

        lblMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaNV.setText("Mã nhân viên");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        lblMatKhau2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMatKhau2.setText("Xác nhận mật khẩu");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHoTen.setText("Họ và tên");

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVaiTro.setText("Vai trò");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoTruongPhong);
        rdoTruongPhong.setSelected(true);
        rdoTruongPhong.setText("Trưởng phòng");

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setText("Nhân viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gioi Tinh");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Lương cơ bản");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("QR code");

        txtqrcode.setEditable(false);

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtqrcode, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlEditLayout.createSequentialGroup()
                            .addComponent(btnThem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnXoa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMoi))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                            .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMatKhau)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMaNV)))
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addGroup(pnlEditLayout.createSequentialGroup()
                                    .addComponent(rdoNam)
                                    .addGap(41, 41, 41)
                                    .addComponent(rdoNu)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                            .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblVaiTro)
                                .addGroup(pnlEditLayout.createSequentialGroup()
                                    .addComponent(rdoTruongPhong)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdoNhanVien))
                                .addComponent(lblMatKhau2)
                                .addComponent(txtMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblHoTen)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(237, 237, 237))
        );

        pnlEditLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblMaNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblHoTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblMatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblMatKhau2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoTruongPhong)
                            .addComponent(rdoNhanVien))))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtqrcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addContainerGap())
        );

        pnlEditLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtHoTen, txtLuong, txtMaNV, txtMatKhau, txtMatKhau2});

        pnlEditLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        pnlTong.add(pnlEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 1020, 410));

        add(pnlTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.randomString();
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();

        }
    }//GEN-LAST:event_tblNhanVienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblMatKhau2;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlTong;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhau2;
    private javax.swing.JTextField txtqrcode;
    // End of variables declaration//GEN-END:variables
}
