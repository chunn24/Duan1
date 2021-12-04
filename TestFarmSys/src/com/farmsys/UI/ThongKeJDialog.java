/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.Entity.KhoHang;
import com.farmsys.Entity.NhanVien;
import com.farmsys.Helper.Auth;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.KhoHangDAO;
import com.farmsys.dao.NhanVienDAO;
import com.farmsys.dao.NhatKyDAO;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author NguyenTrung
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ThongKeJDialog
     */
    public ThongKeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();

    }

    void init() {
        this.fillTableKhoHangAll();
        this.fillTableLuongNhanVien();
    }

    KhoHangDAO khDAO = new KhoHangDAO();
    NhanVienDAO nvDAO = new NhanVienDAO();
    NhatKyDAO nkDAO = new NhatKyDAO();
    ArrayList<KhoHang> list = new ArrayList<>();
    ArrayList<NhanVien> listnv = new ArrayList<>();

    private void fillTableKhoHangAll() {
        DefaultTableModel model = (DefaultTableModel) tblKhoHang.getModel();
        model.setRowCount(0);
        KhoHang khoHang = new KhoHang();
        list = (ArrayList<KhoHang>) khDAO.selectAll();
        for (KhoHang kh : list) {
            model.addRow(new Object[]{
                kh.getTenGian(),
                kh.getTenCay(),
                kh.getTrongLuong(),
                kh.getNgayTH(),
                kh.getGiaThanh()
            });
        }
    }

    private void fillTableLuongNhanVien() {
        DefaultTableModel model = (DefaultTableModel) tblluongnhanvien.getModel();
        model.setRowCount(0);
        listnv = (ArrayList<NhanVien>) nvDAO.selectAll();
        for (NhanVien nv : listnv) {
            int Luong = nv.getLuong();
            Float Bonus = getBonusMonth(nv.getMaNV());
            Float TongLuong = Luong + Bonus;
            model.addRow(new Object[]{
                nv.getHoTen(),
                Luong,
                Bonus,
                TongLuong
            });
        }
    }

    private void xuatExcel() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Thongke");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(3);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Tên giàn");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên cây");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Trọng lượng");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Ngày thu hoạch");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Thành tiền");

            for (int i = 0; i < list.size(); i++) {
                // Modelbook book = arr.get(i);
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(list.get(i).getTenGian());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(list.get(i).getTenCay());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(list.get(i).getTrongLuong());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(list.get(i).getNgayTH() + "");

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(list.get(i).getGiaThanh());
            }
            File file = new File("src\\Excel\\ThongKeDT.xlsx");
            try {
                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                MsgBox.alert(this, "loimofile");
            }
            MsgBox.alert(this, "Đã xuất ra file Excel");

        } catch (Exception e) {
            MsgBox.alert(this, "loimofile");
        }
    }

    float getBonusMonth(String manv) {
        int tongTrongCay = nkDAO.selectDoneMonthByTrangThaiAndCongViecAndNhanVien(3, "Trồng cây", manv).size();
        int tongChamSoc = nkDAO.selectDoneMonthByTrangThaiAndCongViecAndNhanVien(3, "Chăm sóc", manv).size();
        int tongThuHoach = nkDAO.selectDoneMonthByTrangThaiAndCongViecAndNhanVien(3, "Thu hoạch", manv).size();
        int tongCancel = nkDAO.selectDoneMonthByTrangThaiAndNhanVien(2, manv).size();
        int tongHoaHong = nkDAO.selectDoneMonthByTrangThaiAndNhanVien(5, manv).size();
        float bonusTrongCay, bonusChamSoc, bonusThuHoach, bonusCancel, bonusHoaHong, bonus;

        // sét KPI trồng cây và trả về tiền thưởng trồng cây
        if (tongTrongCay > 50) {
            bonusTrongCay = (float) (tongTrongCay * 1.5);
        } else if (tongTrongCay > 30) {
            bonusTrongCay = (float) (tongTrongCay * 1.25);
        } else {
            bonusTrongCay = tongTrongCay * 1;
        }

        // sét KPI chăm sóc và trả về tiền thưởng thu hoạch
        if (tongChamSoc > 150) {
            bonusChamSoc = (float) (tongChamSoc * 1.75);
        } else if (tongChamSoc > 100) {
            bonusChamSoc = (float) (tongChamSoc * 1.5);
        } else if (tongChamSoc > 50) {
            bonusChamSoc = (float) (tongChamSoc * 1.25);
        } else {
            bonusChamSoc = tongChamSoc * 1;
        }

        // sét KPI thu hoạch và trả về tiền thưởng thu hoạch
        if (tongThuHoach > 50) {
            bonusThuHoach = (float) (tongThuHoach * 1.5);
        } else if (tongThuHoach > 25) {
            bonusThuHoach = (float) (tongThuHoach * 1.25);
        } else {
            bonusThuHoach = (float) (tongThuHoach * 1);
        }

        //sét KPI cancel và trả về tiền phạt
        if (tongCancel > 10) {
            bonusCancel = tongCancel * -2;
        } else if (tongCancel > 5) {
            bonusCancel = (float) (tongCancel * -1.5);
        } else if (tongCancel > 3) {
            bonusCancel = (float) (tongCancel * -1.25);
        } else {
            bonusCancel = tongCancel * 0;
        }

        //tìm sản phẩm đã bán và trả về hoa hồng
        bonusHoaHong = tongHoaHong * 2;

        return bonus = bonusTrongCay + bonusChamSoc + bonusThuHoach + bonusCancel + bonusHoaHong;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoHang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblluongnhanvien = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblKhoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên giàn", "Tên cây", "Trọng lượng", "Ngày thu hoạch", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKhoHang);

        jButton1.setText("xuat PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xuat excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 700, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kho hàng", jPanel1);

        tblluongnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên nhân viên", "Lương cố định", "Thưởng", "Tổng lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblluongnhanvien);

        jButton3.setText("xuat PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Xuat excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bảng lương tháng:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("10/2021");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lương nhân viên", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.xuatExcel();
        Runtime run = Runtime.getRuntime();
        String url = "src\\Excel\\ThongKeDT.xlsx";
        try {
            run.exec("rundll32 url.dll, FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(ThongKeJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tblKhoHang.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ThongKeJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblKhoHang;
    private javax.swing.JTable tblluongnhanvien;
    // End of variables declaration//GEN-END:variables

}
