/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.CongViecDAO;
import com.farmsys.dao.NhatKyDAO;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class NhatKyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhatKyJPanel
     */
    public NhatKyJPanel() {
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

        pnlNhatKy = new javax.swing.JPanel();
        pnlBenTrai = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cboLocTenCV = new javax.swing.JComboBox<>();
        lblLocTrangThai = new javax.swing.JLabel();
        cboLocTrangThai = new javax.swing.JComboBox<>();
        btnXuatPDF = new javax.swing.JButton();
        lblTrangThai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlBenPhai = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhatKy = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNhatKy.setMinimumSize(new java.awt.Dimension(1083, 750));
        pnlNhatKy.setPreferredSize(new java.awt.Dimension(1083, 750));
        pnlNhatKy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBenTrai.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setText("NHẬT KÝ CÔNG VIỆC");

        cboLocTenCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Trồng Cây", "Chăm Sóc", "Thu Hoạch" }));
        cboLocTenCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocTenCVActionPerformed(evt);
            }
        });

        lblLocTrangThai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLocTrangThai.setForeground(new java.awt.Color(25, 69, 107));
        lblLocTrangThai.setText("Lọc theo công việc:");

        cboLocTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Chưa nhận", "Đang làm", "Từ chối", "Hoàn thành", "Hoàn thành muộn" }));
        cboLocTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocTrangThaiActionPerformed(evt);
            }
        });

        btnXuatPDF.setBackground(new java.awt.Color(153, 255, 153));
        btnXuatPDF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXuatPDF.setForeground(new java.awt.Color(51, 51, 51));
        btnXuatPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_pdf_35px_1.png"))); // NOI18N
        btnXuatPDF.setText("Xuất PDF");
        btnXuatPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnXuatPDF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnXuatPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPDFActionPerformed(evt);
            }
        });

        lblTrangThai.setBackground(new java.awt.Color(255, 255, 255));
        lblTrangThai.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(51, 51, 51));
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_settings_20px_2.png"))); // NOI18N
        lblTrangThai.setText("Hệ thống trang trại trồng cây thủy canh");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 69, 107));
        jLabel3.setText("Lọc theo trạng thái:");

        javax.swing.GroupLayout pnlBenTraiLayout = new javax.swing.GroupLayout(pnlBenTrai);
        pnlBenTrai.setLayout(pnlBenTraiLayout);
        pnlBenTraiLayout.setHorizontalGroup(
            pnlBenTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBenTraiLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(pnlBenTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBenTraiLayout.createSequentialGroup()
                        .addComponent(lblTrangThai)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBenTraiLayout.createSequentialGroup()
                        .addGroup(pnlBenTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblLocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLocTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuatPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        pnlBenTraiLayout.setVerticalGroup(
            pnlBenTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBenTraiLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitle)
                .addGap(38, 38, 38)
                .addComponent(lblLocTrangThai)
                .addGap(18, 18, 18)
                .addComponent(cboLocTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cboLocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnXuatPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(lblTrangThai)
                .addContainerGap())
        );

        pnlNhatKy.add(pnlBenTrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        pnlBenPhai.setBackground(new java.awt.Color(255, 255, 255));

        tblNhatKy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên công việc", "Tên Cây", "Tên Giàn", "Chi tiết công việc", "Người tạo", "Nhân viên", "Bắt đầu", "Kết thúc", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhatKy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNhatKy.setMinimumSize(new java.awt.Dimension(750, 480));
        tblNhatKy.setRowHeight(40);
        jScrollPane1.setViewportView(tblNhatKy);

        javax.swing.GroupLayout pnlBenPhaiLayout = new javax.swing.GroupLayout(pnlBenPhai);
        pnlBenPhai.setLayout(pnlBenPhaiLayout);
        pnlBenPhaiLayout.setHorizontalGroup(
            pnlBenPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBenPhaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBenPhaiLayout.setVerticalGroup(
            pnlBenPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBenPhaiLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlNhatKy.add(pnlBenPhai, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 0, 750, -1));

        add(pnlNhatKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void cboLocTenCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocTenCVActionPerformed
        // TODO add your handling code here:
        if (cboLocTenCV.getSelectedIndex() == 0) {
            //đổ tất cà thông tin lên table
            this.fillTableNhatKyAll();
        } else if (cboLocTenCV.getSelectedIndex() == 1) {
            //đổ chỉ hiển thị tên công việc là TRỒNG CÂY
            this.fillTableNhatKyByCongViec("Trồng cây");
        } else if (cboLocTenCV.getSelectedIndex() == 2) {
            //đổ chỉ hiển thị tên công việc là CHĂM SÓC
            this.fillTableNhatKyByCongViec("Chăm sóc");
        } else {
            //đổ chỉ hiển thị tên công việc là THU HOẠCH
            this.fillTableNhatKyByCongViec("Thu hoạch");
        }
    }//GEN-LAST:event_cboLocTenCVActionPerformed

    private void cboLocTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocTrangThaiActionPerformed
        // TODO add your handling code here:
        if (cboLocTrangThai.getSelectedIndex() == 0) {
            //đổ tất cà thông tin lên table
            this.fillTableNhatKyAll();
        } else if (cboLocTrangThai.getSelectedIndex() == 1) {
            //trạng thái chưa nhận
            this.fillTableNhatKyByTrangThai(0);
        } else if (cboLocTrangThai.getSelectedIndex() == 2) {
            //trạng thái đang làm
            this.fillTableNhatKyByTrangThai(1);
        } else if (cboLocTrangThai.getSelectedIndex() == 3) {
            //trạng thái từ chối
            this.fillTableNhatKyByTrangThai(2);
        } else if (cboLocTrangThai.getSelectedIndex() == 4) {
            //trạng thái Hoàn Thành
            this.fillTableNhatKyByTrangThai(3);
        } else {
            // trạng thái Hoàn thành trễ
            this.fillTableNhatKyByTrangThai(4);
        }
    }//GEN-LAST:event_cboLocTrangThaiActionPerformed

    private void btnXuatPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPDFActionPerformed
        print();
    }//GEN-LAST:event_btnXuatPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXuatPDF;
    private javax.swing.JComboBox<String> cboLocTenCV;
    private javax.swing.JComboBox<String> cboLocTrangThai;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLocTrangThai;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnlBenPhai;
    private javax.swing.JPanel pnlBenTrai;
    private javax.swing.JPanel pnlNhatKy;
    private javax.swing.JTable tblNhatKy;
    // End of variables declaration//GEN-END:variables
    NhatKyDAO nkdao = new NhatKyDAO();
    CongViecDAO cvdao = new CongViecDAO();

    private void init() {
        this.fillTableNhatKyAll();
        new Timer(2000, (ActionEvent e) -> {
            this.fillTableNhatKyAll();
        }).start();
    }

    private void fillTableNhatKyByCongViec(String tencv) {
        DefaultTableModel model = (DefaultTableModel) tblNhatKy.getModel();
        model.setRowCount(0);
        NhatKy nhatKy = new NhatKy();
        List<NhatKy> list = nkdao.selectByTen(tencv);
        for (NhatKy nk : list) {
            String status = trangThai(nk);
            model.addRow(new Object[]{
                nk.getStt(),
                nk.getTenCV(),
                nk.getTenCay(),
                nk.getTenGian(),
                nk.getChiTiet(),
                nk.getNguoiTao(),
                nk.getNhanVien(),
                nk.getNgayBatDau(),
                nk.getNgayKetThuc(),
                status
            });
        }
    }

    private void fillTableNhatKyByTrangThai(int trangThai) {
        DefaultTableModel model = (DefaultTableModel) tblNhatKy.getModel();
        model.setRowCount(0);
        NhatKy nhatKy = new NhatKy();
        List<NhatKy> list = nkdao.selectByTrangThai(trangThai);
        for (NhatKy nk : list) {
            String status = trangThai(nk);
            model.addRow(new Object[]{
                nk.getStt(),
                nk.getTenCV(),
                nk.getTenCay(),
                nk.getTenGian(),
                nk.getChiTiet(),
                nk.getNguoiTao(),
                nk.getNhanVien(),
                nk.getNgayBatDau(),
                nk.getNgayKetThuc(),
                status
            });
        }
    }

    private void fillTableNhatKyAll() {
        DefaultTableModel model = (DefaultTableModel) tblNhatKy.getModel();
        model.setRowCount(0);
        NhatKy nhatKy = new NhatKy();
        List<NhatKy> list = nkdao.selectAll();
        for (NhatKy nk : list) {
            String status = trangThai(nk);
            model.addRow(new Object[]{
                nk.getStt(),
                nk.getTenCV(),
                nk.getTenCay(),
                nk.getTenGian(),
                nk.getChiTiet(),
                nk.getNguoiTao(),
                nk.getNhanVien(),
                nk.getNgayBatDau(),
                nk.getNgayKetThuc(),
                status
            });
        }
    }

    private String trangThai(NhatKy nk) {
        String status = null;
        switch (nk.getTrangThai()) {
            case 0:
                status = "Chưa nhận";
                break;
            case 1:
                status = "Đang làm";
                break;
            case 2:
                status = "Từ chối";
                break;
            case 3:
                status = "Hoàn thành";
                break;
            default:
                status = "Hoàn thành muộn";
                break;
        }
        return status;
    }

    void print() {
        try {
            Boolean print = tblNhatKy.print();
            if (print) {
                MsgBox.alert(this, "Đã xuất file PDF");
            } else {
                JOptionPane.showMessageDialog(this, "Error !", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException ex) {
            Logger.getLogger(NhanVienJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
