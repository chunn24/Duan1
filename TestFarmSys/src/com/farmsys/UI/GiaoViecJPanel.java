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
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Timer;

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
        jLabel10 = new javax.swing.JLabel();
        txtnguoitao = new javax.swing.JTextField();
        cboCongViec = new javax.swing.JComboBox<>();
        cboGianTrong = new javax.swing.JComboBox<>();
        cboCayTrong = new javax.swing.JComboBox<>();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        cboNhanVien = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giao Việc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Người nhận việc:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ghi chú:");

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ngày bắt đầu:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ngày kiểm tra:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tên công việc:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Giàn cây:");

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
        jLabel6.setText("Cây trồng:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Người tạo:");

        txtnguoitao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGiaoViet, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelTongLayout.createSequentialGroup()
                            .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelTongLayout.createSequentialGroup()
                                    .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGap(35, 35, 35))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)))
                            .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboCayTrong, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboGianTrong, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnguoitao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboCongViec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cboCayTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cboGianTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnguoitao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addComponent(btnGiaoViet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        PanelTongLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboCayTrong, cboCongViec, cboGianTrong});

        PanelTongLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboNhanVien, txtNgayBatDau, txtNgayKetThuc, txtnguoitao});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiaoVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoVietActionPerformed
        this.insert();

    }//GEN-LAST:event_btnGiaoVietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTong;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
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

    void init() {
        txtnguoitao.setText(Auth.user.getMaNV());
        fillComboBoxCongViec();
        fillComboBoxCayTrong();
        fillComboBoxGianTrong();
        fillComboBoxNhanVien();
        new Timer(5000, (ActionEvent e) -> {
            fillComboBoxCongViec();
            fillComboBoxCayTrong();
            fillComboBoxGianTrong();
            fillComboBoxNhanVien();
        }).start();
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
        txtNgayBatDau.setDateFormatString("");
        txtNgayKetThuc.setDateFormatString("");
        txtGhiChu.setText("");
        txtnguoitao.setText("");
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
