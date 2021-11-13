/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.NhatKyDAO;
import java.sql.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trieu
 */
public class CongViecJDialog extends javax.swing.JFrame {

    /**
     * Creates new form CongViecJDialog
     */
    public CongViecJDialog() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        paneldanhsach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcv = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        panelchitiet = new javax.swing.JPanel();
        btnht = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        tong = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtchitiet = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txttencv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtngaykt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabs.setBackground(new java.awt.Color(255, 255, 255));

        paneldanhsach.setBackground(new java.awt.Color(255, 255, 255));

        tblcv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stt", "Tên Công Việc", "Mô Tả", "Ngày Kết Thúc", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcv);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Chi Tiết Công Việc :");

        javax.swing.GroupLayout paneldanhsachLayout = new javax.swing.GroupLayout(paneldanhsach);
        paneldanhsach.setLayout(paneldanhsachLayout);
        paneldanhsachLayout.setHorizontalGroup(
            paneldanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldanhsachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(paneldanhsachLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneldanhsachLayout.setVerticalGroup(
            paneldanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldanhsachLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        tabs.addTab("Danh sách", paneldanhsach);

        panelchitiet.setBackground(new java.awt.Color(255, 255, 255));
        panelchitiet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_ok_40px.png"))); // NOI18N
        btnht.setText("Hoàn thành");
        btnht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhtActionPerformed(evt);
            }
        });
        panelchitiet.add(btnht, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, 60));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 204));
        jLabel7.setText("Quản Lí Công Việc");
        panelchitiet.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));
        panelchitiet.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 640, -1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelchitiet.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 520, -1));

        tong.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtchitiet.setEditable(false);
        txtchitiet.setColumns(20);
        txtchitiet.setRows(5);
        txtchitiet.setText("\n");
        jScrollPane2.setViewportView(txtchitiet);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mô tả :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txttencv.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên công việc  :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ngày kết thúc :");

        txtngaykt.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tongLayout = new javax.swing.GroupLayout(tong);
        tong.setLayout(tongLayout);
        tongLayout.setHorizontalGroup(
            tongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tongLayout.setVerticalGroup(
            tongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );

        panelchitiet.add(tong, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 240));

        tabs.addTab("Chi tiết", panelchitiet);

        getContentPane().add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhtActionPerformed
        this.update();
    }//GEN-LAST:event_btnhtActionPerformed

    private void tblcvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblcv.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblcvMouseClicked

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
            java.util.logging.Logger.getLogger(CongViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CongViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CongViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CongViecJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CongViecJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnht;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelchitiet;
    private javax.swing.JPanel paneldanhsach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblcv;
    private javax.swing.JPanel tong;
    private javax.swing.JTextArea txtchitiet;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txttencv;
    // End of variables declaration//GEN-END:variables

    NhatKyDAO nkDAO = new NhatKyDAO();
    int row = -1;

    private void init() {
        setLocationRelativeTo(null);
        this.row = -1;
        fillTableNguoinhanviec();
    }

    void fillTableNguoinhanviec() {
        DefaultTableModel model = (DefaultTableModel) tblcv.getModel();
        model.setRowCount(0);
        List<NhatKy> list = nkDAO.selectByTrangThai(1);
        for (NhatKy nv : list) {
            String status = trangThai(nv);
            model.addRow(new Object[]{
                nv.getStt(),nv.getTenCV(), nv.getChiTiet(), nv.getNgayKetThuc(), status
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

    void edit() {
        int manv = (int) tblcv.getValueAt(this.row, 0);
        NhatKy nv = nkDAO.selectById(manv);
        this.setForm(nv);
        tabs.setSelectedIndex(1);

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
            default ->
                "Hoàn thành muộn";
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
}
