/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.NhatKyDAO;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.List;
import javax.swing.Timer;
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

        tabs = new javax.swing.JTabbedPane();
        paneldanhsach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcv = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblnhanvien = new javax.swing.JLabel();
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

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setMinimumSize(new java.awt.Dimension(1083, 750));
        tabs.setPreferredSize(new java.awt.Dimension(1083, 750));

        paneldanhsach.setBackground(new java.awt.Color(255, 255, 255));
        paneldanhsach.setMinimumSize(new java.awt.Dimension(1083, 750));
        paneldanhsach.setPreferredSize(new java.awt.Dimension(1083, 750));
        paneldanhsach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        paneldanhsach.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1030, 450));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Chi Tiết Công Việc :");
        paneldanhsach.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblnhanvien.setText("jLabel8");
        paneldanhsach.add(lblnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        tabs.addTab("Danh sách", paneldanhsach);

        panelchitiet.setBackground(new java.awt.Color(255, 255, 255));
        panelchitiet.setMinimumSize(new java.awt.Dimension(1083, 750));
        panelchitiet.setPreferredSize(new java.awt.Dimension(1083, 750));
        panelchitiet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_ok_40px.png"))); // NOI18N
        btnht.setText("Hoàn thành");
        btnht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhtActionPerformed(evt);
            }
        });
        panelchitiet.add(btnht, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 490, 60));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 204));
        jLabel7.setText("Quản Lí Công Việc");
        panelchitiet.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));
        panelchitiet.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 640, -1));

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
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tongLayout = new javax.swing.GroupLayout(tong);
        tong.setLayout(tongLayout);
        tongLayout.setHorizontalGroup(
            tongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        tongLayout.setVerticalGroup(
            tongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tongLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelchitiet.add(tong, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 500, 290));

        tabs.addTab("Chi tiết", panelchitiet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 739, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblcvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblcv.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblcvMouseClicked

    private void btnhtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhtActionPerformed
        this.update();
    }//GEN-LAST:event_btnhtActionPerformed


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
    private javax.swing.JLabel lblnhanvien;
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
        this.row = -1;
        loadLbl();
        fillTableNguoinhanviec();
        new Timer(5000, (ActionEvent e) -> {            
            fillTableNguoinhanviec();
        }).start();
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
                nv.getStt(), nv.getTenCV(), nv.getChiTiet(), nv.getNgayKetThuc(), status
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
        NhatKy nv = nkDAO.selectformtodoanddoing(manv);
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
