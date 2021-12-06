/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.Entity.CayTrong;
import com.farmsys.Entity.CongViec;
import com.farmsys.Entity.GianTrong;
import com.farmsys.Entity.NhanVien;
import com.farmsys.Entity.NhatKy;
import com.farmsys.Entity.ThuHoach;
import com.farmsys.Helper.Auth;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.CayTrongDAO;
import com.farmsys.dao.CongViecDAO;
import com.farmsys.dao.GianTrongDAO;
import com.farmsys.dao.NhanVienDAO;
import com.farmsys.dao.NhatKyDAO;
import com.farmsys.dao.ThuHoachDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NguyenTrung
 */
public class GiaoViecJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GiaoViecJPanel
     */
    public GiaoViecJPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        lblNguoiNhanViec = new javax.swing.JLabel();
        lblghiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        lblNgayBD = new javax.swing.JLabel();
        lblKiemTra = new javax.swing.JLabel();
        lblTenCV = new javax.swing.JLabel();
        lblGianCay = new javax.swing.JLabel();
        btnGiaoViec = new javax.swing.JButton();
        lblCaytrong = new javax.swing.JLabel();
        lblNguoiTao = new javax.swing.JLabel();
        txtnguoitao = new javax.swing.JTextField();
        cboCongViec = new javax.swing.JComboBox<>();
        cboGianTrong = new javax.swing.JComboBox<>();
        cboCayTrong = new javax.swing.JComboBox<>();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        cboNhanVien = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGiaoViec = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giao Việc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 204))); // NOI18N
        PanelTong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNguoiNhanViec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNguoiNhanViec.setText("Người nhận việc:");
        PanelTong.add(lblNguoiNhanViec, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        lblghiChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblghiChu.setText("Ghi chú:");
        PanelTong.add(lblghiChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        PanelTong.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 260, 109));

        lblNgayBD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNgayBD.setText("Ngày bắt đầu:");
        PanelTong.add(lblNgayBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        lblKiemTra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblKiemTra.setText("Ngày kiểm tra:");
        PanelTong.add(lblKiemTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        lblTenCV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTenCV.setText("Tên công việc:");
        PanelTong.add(lblTenCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        lblGianCay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGianCay.setText("Giàn cây:");
        PanelTong.add(lblGianCay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        btnGiaoViec.setBackground(new java.awt.Color(19, 148, 147));
        btnGiaoViec.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnGiaoViec.setForeground(new java.awt.Color(248, 241, 241));
        btnGiaoViec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_checkmark_35px.png"))); // NOI18N
        btnGiaoViec.setText("GIAO VIỆC");
        btnGiaoViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoViecActionPerformed(evt);
            }
        });
        PanelTong.add(btnGiaoViec, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 470, 40));

        lblCaytrong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCaytrong.setText("Cây trồng:");
        PanelTong.add(lblCaytrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        lblNguoiTao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNguoiTao.setText("Người tạo:");
        PanelTong.add(lblNguoiTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        txtnguoitao.setEditable(false);
        txtnguoitao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnguoitao.setEnabled(false);
        PanelTong.add(txtnguoitao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 316, 37));

        cboCongViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCongViecActionPerformed(evt);
            }
        });
        PanelTong.add(cboCongViec, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, 37));

        PanelTong.add(cboGianTrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 260, 37));

        PanelTong.add(cboCayTrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 316, 37));
        PanelTong.add(txtNgayBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 316, 37));
        PanelTong.add(txtNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 316, 37));

        PanelTong.add(cboNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 260, 37));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblGiaoViec.setAutoCreateRowSorter(true);
        tblGiaoViec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên công việc", "Tên Cây", "Tên Giàn", "Chi tiết công việc", "Người tạo", "Nhân viên", "Bắt đầu", "Kết thúc", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGiaoViec.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblGiaoViec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblGiaoViec.setDropMode(javax.swing.DropMode.INSERT);
        tblGiaoViec.setFillsViewportHeight(true);
        tblGiaoViec.setFocusable(false);
        tblGiaoViec.setGridColor(new java.awt.Color(255, 255, 255));
        tblGiaoViec.setMinimumSize(new java.awt.Dimension(750, 480));
        tblGiaoViec.setRowHeight(40);
        tblGiaoViec.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGiaoViec.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGiaoViec.setUpdateSelectionOnSort(false);
        tblGiaoViec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGiaoViecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGiaoViec);

        PanelTong.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 1020, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiaoViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoViecActionPerformed
        this.insert();

    }//GEN-LAST:event_btnGiaoViecActionPerformed

    private void cboCongViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCongViecActionPerformed

        switch (cboCongViec.getSelectedIndex()) {
            case 0 ->
                this.fillComboBoxGianTrongChamSoc();

            case 1 ->
                this.fillComboBoxGianTrongThuHoach();

            default -> {
                this.fillComboBoxGianTrongTrongCay();

            }
        }
    }//GEN-LAST:event_cboCongViecActionPerformed

    private void tblGiaoViecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGiaoViecMouseClicked

    }//GEN-LAST:event_tblGiaoViecMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTong;
    private javax.swing.JButton btnGiaoViec;
    private javax.swing.JComboBox<String> cboCayTrong;
    private javax.swing.JComboBox<String> cboCongViec;
    private javax.swing.JComboBox<String> cboGianTrong;
    private javax.swing.JComboBox<String> cboNhanVien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCaytrong;
    private javax.swing.JLabel lblGianCay;
    private javax.swing.JLabel lblKiemTra;
    private javax.swing.JLabel lblNgayBD;
    private javax.swing.JLabel lblNguoiNhanViec;
    private javax.swing.JLabel lblNguoiTao;
    private javax.swing.JLabel lblTenCV;
    private javax.swing.JLabel lblghiChu;
    private javax.swing.JTable tblGiaoViec;
    private javax.swing.JTextArea txtGhiChu;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private javax.swing.JTextField txtnguoitao;
    // End of variables declaration//GEN-END:variables
    NhatKyDAO nkdao = new NhatKyDAO();
    CayTrongDAO ctdao = new CayTrongDAO();
    GianTrongDAO dtdao = new GianTrongDAO();
    CongViecDAO cvdao = new CongViecDAO();
    NhanVienDAO nvdao = new NhanVienDAO();
    ThuHoachDAO thdao = new ThuHoachDAO();

    void init() {
        txtnguoitao.setText(Auth.user.getMaNV());
        fillComboBoxCongViec();
        fillComboBoxCayTrong();
//        fillComboBoxGianTrong();
        fillComboBoxNhanVien();
        fillTableNguoinhanviec();
    }

    void fillTableNguoinhanviec() {
        DefaultTableModel model = (DefaultTableModel) tblGiaoViec.getModel();
        model.setRowCount(0);
        List<NhatKy> list = nkdao.selectByTrangThai(0);
        for (NhatKy nk : list) {
            model.addRow(new Object[]{
                nk.getTenCV(),
                nk.getTenCay(),
                nk.getTenGian(),
                nk.getChiTiet(),
                nk.getNguoiTao(),
                nk.getNhanVien(),
                nk.getNgayBatDau(),
                nk.getNgayKetThuc(),
                nk.toString()
            });
        }

    }

    void fillComboBoxCayTrong() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboCayTrong.getModel();
        model.removeAllElements();
        List<CayTrong> list = ctdao.selectAll();
        for (CayTrong ct : list) {
            model.addElement(ct);
        }
    }

    void fillComboBoxGianTrong() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboGianTrong.getModel();
        model.removeAllElements();
        List<GianTrong> list = dtdao.selectByTT(0);
        for (GianTrong dt : list) {
            model.addElement(dt);
        }
    }

    void fillComboBoxGianTrongTrongCay() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboGianTrong.getModel();
        model.removeAllElements();
        List<GianTrong> list = dtdao.selectByTT(0);
        for (GianTrong dt : list) {
            model.addElement(dt);
        }
    }

    void fillComboBoxGianTrongChamSoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboGianTrong.getModel();
        model.removeAllElements();
        List<GianTrong> list = dtdao.selectByTT(1);
        for (GianTrong dt : list) {
            model.addElement(dt);
        }
    }

    void fillComboBoxGianTrongThuHoach() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboGianTrong.getModel();
        model.removeAllElements();
        List<ThuHoach> list = thdao.selectAll();
        System.out.println(thdao.selectAll());
        for (ThuHoach th : list) {
            model.addElement(th);
        }
    }

    void fillComboBoxCongViec() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboCongViec.getModel();
        model.removeAllElements();
        List<CongViec> list = cvdao.selectAll();
        for (CongViec cv : list) {
            model.addElement(cv);
        }
    }

    void fillComboBoxNhanVien() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNhanVien.getModel();
        model.removeAllElements();
        List<NhanVien> list = nvdao.selectNhanVien();
        for (NhanVien nv : list) {
            model.addElement(nv);
        }
    }

    void insert() {
        NhatKy kh = getForm();
        GianTrong gt = new GianTrong();
        if (kh == null) {
            return;
        } else {
            try {
                nkdao.insert(kh);
                dtdao.updateTrangThai(String.valueOf(cboGianTrong.getSelectedItem()));
                fillTableNguoinhanviec();
                this.clearForm();
                MsgBox.alert(this, "Đã thêm thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm thất bại!");
            }
        }
        this.fillComboBoxGianTrong();
    }

    void clearForm() {
        txtGhiChu.setText("");
    }

    NhatKy getForm() {
        if (Validation()) {
            NhatKy nv = new NhatKy();
            nv.setTenCV(String.valueOf(cboCongViec.getSelectedItem()));
            nv.setTenCay(String.valueOf(cboCayTrong.getSelectedItem()));
            nv.setTenGian(String.valueOf(cboGianTrong.getSelectedItem()));
            nv.setChiTiet(txtGhiChu.getText());
            nv.setNguoiTao(txtnguoitao.getText());
            nv.setNhanVien(String.valueOf(cboNhanVien.getSelectedItem()));
            nv.setNgayBatDau(txtNgayBatDau.getDate());
            nv.setNgayKetThuc(txtNgayKetThuc.getDate());
            // nv.setTrangThai(Integer.valueOf(txttrangthai.getText()));
            return nv;
        }
        return null;
    }

    private boolean Validation() {

        //kiểm lỗi ngày bắt đầu
        try {
            txtNgayBatDau.getCalendar().getTime();
        } catch (Exception e) {
            MsgBox.alert(this, "Bạn chưa chọn ngày bắt đầu");
            txtNgayBatDau.requestFocus();
            return false;
        }

        //kiểm lỗi ngày kết thúc
        try {
            txtNgayKetThuc.getCalendar().getTime();
        } catch (Exception e) {
            MsgBox.alert(this, "Bạn chưa chọn ngày kết thúc");
            txtNgayKetThuc.requestFocus();
            return false;
        }
        return true;

    }
}
