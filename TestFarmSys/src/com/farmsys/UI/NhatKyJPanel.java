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
        jLabel3 = new javax.swing.JLabel();
        pnlBenPhai = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhatKy = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNhatKy.setMinimumSize(new java.awt.Dimension(1083, 750));
        pnlNhatKy.setPreferredSize(new java.awt.Dimension(1083, 750));
        pnlNhatKy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBenTrai.setBackground(new java.awt.Color(255, 255, 255));
        pnlBenTrai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlBenTrai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setText("NHẬT KÝ CÔNG VIỆC");
        pnlBenTrai.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 51, -1, -1));

        cboLocTenCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Trồng Cây", "Chăm Sóc", "Thu Hoạch" }));
        cboLocTenCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocTenCVActionPerformed(evt);
            }
        });
        pnlBenTrai.add(cboLocTenCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 251, 38));

        lblLocTrangThai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLocTrangThai.setForeground(new java.awt.Color(25, 69, 107));
        lblLocTrangThai.setText("Lọc theo công việc:");
        pnlBenTrai.add(lblLocTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 132, -1));

        cboLocTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Chưa nhận", "Đang làm", "Từ chối", "Hoàn thành", "Hoàn thành muộn" }));
        cboLocTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocTrangThaiActionPerformed(evt);
            }
        });
        pnlBenTrai.add(cboLocTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 251, 39));

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
        pnlBenTrai.add(btnXuatPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, 53));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 69, 107));
        jLabel3.setText("Lọc theo trạng thái:");
        pnlBenTrai.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 136, -1));

        pnlNhatKy.add(pnlBenTrai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 730));

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
        tblNhatKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblNhatKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblNhatKyMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhatKy);

        javax.swing.GroupLayout pnlBenPhaiLayout = new javax.swing.GroupLayout(pnlBenPhai);
        pnlBenPhai.setLayout(pnlBenPhaiLayout);
        pnlBenPhaiLayout.setHorizontalGroup(
            pnlBenPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBenPhaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBenPhaiLayout.setVerticalGroup(
            pnlBenPhaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBenPhaiLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlNhatKy.add(pnlBenPhai, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 0, 800, 730));

        add(pnlNhatKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 730));
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

    private void tblNhatKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhatKyMouseEntered
        fillTableNhatKyAll();
    }//GEN-LAST:event_tblNhatKyMouseEntered

    private void tblNhatKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhatKyMouseExited
        fillTableNhatKyAll();
    }//GEN-LAST:event_tblNhatKyMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXuatPDF;
    private javax.swing.JComboBox<String> cboLocTenCV;
    private javax.swing.JComboBox<String> cboLocTrangThai;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLocTrangThai;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBenPhai;
    private javax.swing.JPanel pnlBenTrai;
    private javax.swing.JPanel pnlNhatKy;
    private javax.swing.JTable tblNhatKy;
    // End of variables declaration//GEN-END:variables
    NhatKyDAO nkdao = new NhatKyDAO();
    CongViecDAO cvdao = new CongViecDAO();

    private void init() {
        this.fillTableNhatKyAll();
        new Timer(30000, (ActionEvent e) -> {
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

    void print() {
        try {
            Boolean print = tblNhatKy.print();
            if (print) {
                MsgBox.alert(this, "Đã xuất file PDF");
            } else {

            }
        } catch (PrinterException ex) {
            Logger.getLogger(NhatKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
