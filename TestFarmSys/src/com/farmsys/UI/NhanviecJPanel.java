/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.GianTrong;
import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.GianTrongDAO;
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
public class NhanViecJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanviecJPanel
     */
    public NhanViecJPanel() {
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

        pnltong = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcv = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblnhanvien = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttencv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmota = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtgiaoviec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtngaykt = new javax.swing.JTextField();
        btnhuy = new javax.swing.JButton();
        btnnhanviec = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        pnltong.setBackground(new java.awt.Color(255, 255, 255));
        pnltong.setMinimumSize(new java.awt.Dimension(1083, 750));
        pnltong.setPreferredSize(new java.awt.Dimension(1083, 750));
        pnltong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabs.setBackground(new java.awt.Color(204, 255, 204));
        tabs.setMinimumSize(new java.awt.Dimension(1083, 750));
        tabs.setPreferredSize(new java.awt.Dimension(1083, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblcv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên Công Việc", "Mô Tả", "Người Giao Việc", "Ngày Kết Thúc", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 1035, 506));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Chi Tiết Công Việc :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, -1, -1));

        lblnhanvien.setText("jLabel8");
        jPanel1.add(lblnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, -1, -1));

        tabs.addTab("Danh Sách", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Tên công việc: ");

        txttencv.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Mô tả: ");

        txtmota.setEditable(false);
        txtmota.setColumns(20);
        txtmota.setRows(5);
        jScrollPane2.setViewportView(txtmota);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Người giao việc: ");

        txtgiaoviec.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Ngày kết thúc: ");

        txtngaykt.setEditable(false);

        btnhuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_cancel_40px.png"))); // NOI18N
        btnhuy.setText("Từ chối");
        btnhuy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhuy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        btnnhanviec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnhanviec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_ok_40px.png"))); // NOI18N
        btnnhanviec.setText("Nhận việc");
        btnnhanviec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnhanviec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnhanviec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanviecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(77, 77, 77))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnnhanviec, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgiaoviec, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtgiaoviec, txtngaykt, txttencv});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgiaoviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhuy)
                    .addComponent(btnnhanviec))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtgiaoviec, txtngaykt, txttencv});

        tabs.addTab("Chi Tiết", jPanel2);

        pnltong.add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1060, 710));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("Quản Lí  Công Việc Nhân Viên");
        pnltong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnltong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnltong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblcvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblcv.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblcvMouseClicked

    private void btnnhanviecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanviecActionPerformed
        this.update();
    }//GEN-LAST:event_btnnhanviecActionPerformed

    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        this.updateAgain();
    }//GEN-LAST:event_btnhuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhuy;
    private javax.swing.JButton btnnhanviec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblnhanvien;
    private javax.swing.JPanel pnltong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblcv;
    private javax.swing.JTextField txtgiaoviec;
    private javax.swing.JTextArea txtmota;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txttencv;
    // End of variables declaration//GEN-END:variables
    NhatKyDAO nkDAO = new NhatKyDAO();
    GianTrongDAO gtDAO = new GianTrongDAO();
    int row = -1;

    private void init() {
        this.row = -1;
        loadLbl();
        fillTableNguoinhanviec();
        new Timer(10000, (ActionEvent e) -> {
            fillTableNguoinhanviec();
        }).start();
    }

    private void loadLbl() {
        lblnhanvien.setText(DangNhapJDialog.HienThiTen());
    }

    void fillTableNguoinhanviec() {
        DefaultTableModel model = (DefaultTableModel) tblcv.getModel();
        model.setRowCount(0);
        String tennv = lblnhanvien.getText();
        List<NhatKy> list = nkDAO.selectByTrangThaivaTennv(0, tennv);
        for (NhatKy nv : list) {
            String status = trangThai(nv);
            model.addRow(new Object[]{
                nv.getStt(), nv.getTenCV(), nv.getChiTiet(), nv.getTenGian(), nv.getNguoiTao(), nv.getNgayKetThuc(), status
            });
        }

    }

    void update() {
        NhatKy nv = getForm();

        if (nv == null) {
            return;
        } else {
            try {
                nkDAO.update((int) tblcv.getValueAt(this.row, 0));
                this.fillTableNguoinhanviec();
                MsgBox.alert(this, "Nhận việc thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Nhận việc thất bại!");
            }
        }
    }

    void updateAgain() {
        NhatKy nv = getForm();
        GianTrong gt = new GianTrong();
        if (nv == null) {
            return;
        } else {
            try {
                nkDAO.updateTuChoi((int) tblcv.getValueAt(this.row, 0));
                gtDAO.updateAgain((String) tblcv.getValueAt(this.row, 3));
                this.fillTableNguoinhanviec();
                MsgBox.alert(this, "Đã từ chối!");
            } catch (Exception e) {
                MsgBox.alert(this, "Từ chối thất bại!");
            }
        }
    }

    void setForm(NhatKy nv) {
        txttencv.setText(nv.getTenCV());
        txtmota.setText(nv.getChiTiet());
        txtgiaoviec.setText(nv.getNguoiTao());
        txtngaykt.setText(String.valueOf(nv.getNgayKetThuc()));

    }

    NhatKy getForm() {
        if (Validation()) {
            NhatKy nv = new NhatKy();
            nv.setTenCV(txttencv.getText());
            nv.setChiTiet(txtmota.getText());
            nv.setNguoiTao(txtgiaoviec.getText());
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
