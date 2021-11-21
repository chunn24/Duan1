/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.KhoHang;
import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.KhoHangDAO;
import com.farmsys.dao.NhatKyDAO;
import java.sql.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NguyenTrung
 */
public class HoanThanhcvJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HoanThanhcvJPanel
     */
    public HoanThanhcvJPanel() {
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

        paneldanhsach = new javax.swing.JPanel();
        tong = new javax.swing.JPanel();
        btnht = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcv = new javax.swing.JTable();
        lblnhanvien = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttencv = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtchitiet = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtngaykt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneldanhsach.setBackground(new java.awt.Color(255, 255, 255));
        paneldanhsach.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xác nhận", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        paneldanhsach.setMinimumSize(new java.awt.Dimension(1083, 750));
        paneldanhsach.setPreferredSize(new java.awt.Dimension(1083, 750));
        paneldanhsach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tong.setBackground(new java.awt.Color(255, 255, 255));
        tong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnht.setBackground(new java.awt.Color(153, 255, 153));
        btnht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_ok_40px.png"))); // NOI18N
        btnht.setText("Hoàn thành");
        btnht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhtActionPerformed(evt);
            }
        });
        tong.add(btnht, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 260, 60));

        tblcv.setAutoCreateRowSorter(true);
        tblcv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Stt", "Tên Công Việc", "Tên Giàn", "Tên Cây", "Mô Tả", "Ngày Kết Thúc", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcvMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblcvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblcvMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tblcv);

        tong.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 320));

        lblnhanvien.setText("jLabel8");
        tong.add(lblnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên công việc  :");
        tong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        txttencv.setEditable(false);
        tong.add(txttencv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 260, -1));

        txtchitiet.setEditable(false);
        txtchitiet.setColumns(20);
        txtchitiet.setRows(5);
        txtchitiet.setText("\n");
        jScrollPane2.setViewportView(txtchitiet);

        tong.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 260, 112));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mô tả :");
        tong.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ngày kết thúc :");
        tong.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        txtngaykt.setEditable(false);
        tong.add(txtngaykt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 260, 29));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/hoanthanh.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tong.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 670, 340));

        paneldanhsach.add(tong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1050, 690));

        add(paneldanhsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void tblcvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblcv.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblcvMouseClicked

    private void btnhtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhtActionPerformed
        String TenCV = txttencv.getText();
        if (TenCV.equals("Thu hoạch")) {
            SoLuong = Float.parseFloat(MsgBox.prompt(this, "Số Lượng Thu Hoạch(kg):"));

            this.insertKhoHang();

        }

        this.update();

    }//GEN-LAST:event_btnhtActionPerformed

    private void tblcvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseEntered
        this.fillTableNguoinhanviec();

    }//GEN-LAST:event_tblcvMouseEntered

    private void tblcvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseExited
        this.fillTableNguoinhanviec();

    }//GEN-LAST:event_tblcvMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnht;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblnhanvien;
    private javax.swing.JPanel paneldanhsach;
    private javax.swing.JTable tblcv;
    private javax.swing.JPanel tong;
    private javax.swing.JTextArea txtchitiet;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txttencv;
    // End of variables declaration//GEN-END:variables
    KhoHangDAO khDAO = new KhoHangDAO();
    NhatKyDAO nkDAO = new NhatKyDAO();
    int row = -1;
    Float SoLuong;

    private void init() {
        this.row = -1;
        loadLbl();
        fillTableNguoinhanviec();
    }

    private void loadLbl() {
        lblnhanvien.setText(DangNhapJDialog.HienThiTen());
    }

    void fillTableNguoinhanviec() {
        DefaultTableModel model = (DefaultTableModel) tblcv.getModel();
        model.setRowCount(0);
        String ten = lblnhanvien.getText();
        List<NhatKy> list = nkDAO.selectByTrangThaivaTennv(1, ten);
        for (NhatKy nv : list) {
            String status = trangThai(nv);
            model.addRow(new Object[]{
                nv.getStt(), nv.getTenCV(), nv.getTenGian(), nv.getTenCay(), nv.getChiTiet(), nv.getNgayKetThuc(), status
            });
        }
    }

    void update() {
        NhatKy nv = getForm();
        if (nv == null) {
            return;
        } else {
            try {
                nkDAO.updateTrangThai((int) tblcv.getValueAt(this.row, 0));
                this.fillTableNguoinhanviec();
                MsgBox.alert(this, "Nhận việc thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Nhận việc thất bại!");
                e.printStackTrace();
            }
        }
    }

    void setForm(NhatKy nv) {

        txttencv.setText(nv.getTenCV());
        txtchitiet.setText(nv.getChiTiet());
        txtngaykt.setText(String.valueOf(nv.getNgayKetThuc()));

    }

    NhatKy getForm() {
        if (Validation()) {
            NhatKy nv = new NhatKy();

            nv.setTenCV(txttencv.getText());
            nv.setChiTiet(txtchitiet.getText());
            nv.setNgayKetThuc(Date.valueOf(txtngaykt.getText()));

            return nv;
        }
        return null;
    }

    KhoHang getTable() {
        KhoHang kh = new KhoHang();
        kh.setTenGian(tblcv.getValueAt(this.row, 2) + "");
        System.out.println(tblcv.getValueAt(this.row, 2) + "");
        kh.setTenCay(tblcv.getValueAt(this.row, 3) + "");
        kh.setTrongLuong(SoLuong);
        kh.setNgayTH((Date) tblcv.getValueAt(this.row, 5));
        return kh;
    }

    void edit() {
        String manv = (String) tblcv.getValueAt(this.row, 1);
        NhatKy nv = nkDAO.selectById(manv);
        this.setForm(nv);

    }

    private String trangThai(NhatKy nk) {
        String status = null;
        status = switch (nk.getTrangThai()) {
            case 0 ->
                "Chưa nhận";
            case 1 ->
                "Đang làm";
            case 2 ->
                "Từ chối";
            case 3 ->
                "Hoàn thành";
            case 4 ->

                "Hoàn thành muộn";
            default ->
                "Buy";

        };
        return status;
    }

    boolean Validation() {
        //Kiểm tra mã nhân viên
        if (txttencv.getText().length() == 0) {

            return false;
        }
        return true;
    }

    void insertKhoHang() {
        KhoHang kh = getTable();
        try {
            khDAO.insert(kh);
            MsgBox.alert(this, "abc");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
