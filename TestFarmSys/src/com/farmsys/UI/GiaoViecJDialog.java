/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.CayTrong;
import com.farmsys.DTO.CongViec;
import com.farmsys.DTO.GianTrong;
import com.farmsys.DTO.NhanVien;
import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.Auth;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.CayTrongDAO;
import com.farmsys.dao.CongViecDAO;
import com.farmsys.dao.GianTrongDAO;
import com.farmsys.dao.NhanVienDAO;
import com.farmsys.dao.NhatKyDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author NguyenTrung
 */
public final class GiaoViecJDialog extends javax.swing.JDialog {

    /**
     * Creates new form GiaoViecJDialog
     *
     * @param parent
     * @param modal
     */
    public GiaoViecJDialog(java.awt.Frame parent, boolean modal) {

        initComponents();
        init();
        fillComboBoxCongViec();
        fillComboBoxCayTrong();
        fillComboBoxGianTrong();
        fillComboBoxNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGiaoViet = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttrangthai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnguoitao = new javax.swing.JTextField();
        cboCongViec = new javax.swing.JComboBox<>();
        cboGianTrong = new javax.swing.JComboBox<>();
        cboCayTrong = new javax.swing.JComboBox<>();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        cboNhanVien = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 251, 137));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giao Việc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Người Nhận Việc");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGhiChu.setRows(5);
        txtGhiChu.setText("123");
        jScrollPane2.setViewportView(txtGhiChu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ngày bắt đầu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ngày kiểm tra");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tên Công Việc");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Giàn Cây");

        btnGiaoViet.setBackground(new java.awt.Color(19, 148, 147));
        btnGiaoViet.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnGiaoViet.setForeground(new java.awt.Color(248, 241, 241));
        btnGiaoViet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_checkmark_35px.png"))); // NOI18N
        btnGiaoViet.setText("GIAO VIỆC");
        btnGiaoViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoVietActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cây Trồng");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Trạng Thái");

        txttrangthai.setEditable(false);
        txttrangthai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttrangthai.setText("0");
        txttrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrangthaiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Người tạo");

        txtnguoitao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGiaoViet, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txttrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(cboNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cboCayTrong, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboGianTrong, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnguoitao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                            .addComponent(cboCongViec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNgayBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(154, 154, 154)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cboCayTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cboGianTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnguoitao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txttrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(btnGiaoViet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboCayTrong, cboCongViec, cboGianTrong});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiaoVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoVietActionPerformed
        this.insert();
        
    }//GEN-LAST:event_btnGiaoVietActionPerformed

    private void txttrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrangthaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GiaoViecJDialog dialog = new GiaoViecJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaoViet;
    private javax.swing.JComboBox<String> cboCayTrong;
    private javax.swing.JComboBox<String> cboCongViec;
    private javax.swing.JComboBox<String> cboGianTrong;
    private javax.swing.JComboBox<String> cboNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtGhiChu;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private javax.swing.JTextField txtnguoitao;
    private javax.swing.JTextField txttrangthai;
    // End of variables declaration//GEN-END:variables
    NhatKyDAO nkdao = new NhatKyDAO();
    CayTrongDAO ctdao = new CayTrongDAO();
    GianTrongDAO dtdao = new GianTrongDAO();
    CongViecDAO cvdao = new CongViecDAO();
    NhanVienDAO nvdao = new NhanVienDAO();
    

    void init() {
        setLocationRelativeTo(null);
        txtnguoitao.setText(Auth.user.getMaNV());

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
                // this.clearForm();
                MsgBox.alert(this, "Đã thêm thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm thất bại!");
            }
        }
        this.fillComboBoxGianTrong();
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

    boolean Validation() {
        //Kiểm tra mã nhân viên
        if (txtnguoitao.getText().length() == 0) {

            return false;
        }
        return true;
    }
}
