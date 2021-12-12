/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.Entity.GianTrong;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.GianTrongDAO;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NguyenTrung
 */
public class GianTrongJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GianTrongJPanel
     */
    public GianTrongJPanel() {
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

        panelTong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGianTrong = new javax.swing.JTable();
        txtMaDanTrong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDanTrong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        cboLoc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        panelTong.setBackground(new java.awt.Color(255, 255, 255));
        panelTong.setMinimumSize(new java.awt.Dimension(1083, 750));
        panelTong.setPreferredSize(new java.awt.Dimension(1083, 750));
        panelTong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGianTrong.setAutoCreateRowSorter(true);
        tblGianTrong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblGianTrong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã", "Tên dàn trồng", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGianTrong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGianTrong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGianTrong.setShowGrid(false);
        tblGianTrong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGianTrongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGianTrong);
        if (tblGianTrong.getColumnModel().getColumnCount() > 0) {
            tblGianTrong.getColumnModel().getColumn(0).setMinWidth(50);
            tblGianTrong.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblGianTrong.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        panelTong.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1040, 360));

        txtMaDanTrong.setEditable(false);
        txtMaDanTrong.setBackground(new java.awt.Color(204, 204, 204));
        txtMaDanTrong.setEnabled(false);
        txtMaDanTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDanTrongActionPerformed(evt);
            }
        });
        panelTong.add(txtMaDanTrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 480, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã dàn trồng:");
        panelTong.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tên dàn trồng:");
        panelTong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        txtTenDanTrong.setText("Nhập tên dàn trồng !");
        txtTenDanTrong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenDanTrongFocusGained(evt);
            }
        });
        panelTong.add(txtTenDanTrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 480, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Trạng thái:");
        panelTong.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        txtTrangThai.setEditable(false);
        txtTrangThai.setBackground(new java.awt.Color(204, 204, 204));
        txtTrangThai.setEnabled(false);
        panelTong.add(txtTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 480, 30));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        panelTong.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, -1, 49));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Refresh.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        panelTong.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, -1, 49));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        panelTong.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, -1, 49));

        btnMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/new.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        panelTong.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, -1, 50));

        cboLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Chưa hoạt động", "Đang hoạt động" }));
        cboLoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboLocMouseClicked(evt);
            }
        });
        cboLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocActionPerformed(evt);
            }
        });
        panelTong.add(cboLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, 30));

        jLabel4.setText("Lọc theo:");
        panelTong.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenDanTrongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDanTrongFocusGained
        // TODO add your handling code here:
        if (txtTenDanTrong.getText().trim().endsWith("Nhập tên dàn trồng !")) {
            txtTenDanTrong.setText("");
        }
    }//GEN-LAST:event_txtTenDanTrongFocusGained

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (validation()) {
            if (checkTenGian(txtTenDanTrong)) {
                if (checkTrungTen(txtTenDanTrong)) {
                    insert();
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (validation()) {
            if (checkTenGian(txtTenDanTrong)) {
                update();
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed

        this.clear();

    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblGianTrongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGianTrongMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.index = tblGianTrong.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblGianTrongMouseClicked

    private void cboLocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboLocMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLocMouseClicked

    private void cboLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocActionPerformed
        // TODO add your handling code here:
        if (cboLoc.getSelectedIndex() == 0) {
            this.load();
        } else {
            fillTableToComboBoxLoc();
        }
    }//GEN-LAST:event_cboLocActionPerformed

    private void txtMaDanTrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDanTrongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDanTrongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTong;
    private javax.swing.JTable tblGianTrong;
    private javax.swing.JTextField txtMaDanTrong;
    private javax.swing.JTextField txtTenDanTrong;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables

    GianTrongDAO gtdao = new GianTrongDAO();
    int index = -1;

    private void init() {
        this.load();
        this.setStatus(true);

    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblGianTrong.getModel();
        model.setRowCount(0);
        try {
            List<GianTrong> list = gtdao.selectAll();
            for (GianTrong gt : list) {
                Object[] row = {
                    gt.getMaDan(),
                    gt.getTenDan(),
                    gt.isTrangThai() ? "Đã trồng" : "Chưa trồng"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillTableToComboBoxLoc() {
        DefaultTableModel model = (DefaultTableModel) tblGianTrong.getModel();
        model.setRowCount(0);
        try {
            List<GianTrong> list = gtdao.selectByTT(cboLoc.getSelectedIndex() - 1);
            for (GianTrong gt : list) {
                Object[] row = {
                    gt.getMaDan(),
                    gt.getTenDan(),
                    gt.isTrangThai() ? "Đã trồng" : "Chưa trồng"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        GianTrong model = getModelInsert();
        try {
            gtdao.insert(model);
            this.load();
            this.clear();
            MsgBox.alert(this, "Thêm mới thành công !");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới không thành công !");
        }
    }

    void update() {
        GianTrong model = getModel();
        try {
            gtdao.update(model);
            this.load();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            System.out.println(e);
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa dàn trồng này?")) {
            String manv = txtMaDanTrong.getText();
            try {
                gtdao.delete(manv);
                this.load();
                this.clear();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    void edit() {
        try {
            Integer magt = (Integer) tblGianTrong.getValueAt(this.index, 0);
            GianTrong model = gtdao.selectById(magt);
            this.setModel(model);
            this.setStatus(false);
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear() {
        GianTrong gt = new GianTrong();
        this.setModel(gt);
        this.index = -1;
        this.setStatus(true);
        txtMaDanTrong.setText("");
        txtTrangThai.setText("Chưa hoạt động");

    }

    void setModel(GianTrong model) {
        txtMaDanTrong.setText(String.valueOf(model.getMaDan()));
        txtTenDanTrong.setText(model.getTenDan());
        String tt;
        if (model.isTrangThai()) {
            tt = "Hoạt động";
        } else {
            tt = "Chưa hoạt động";
        }
        txtTrangThai.setText(tt);
    }

    GianTrong getModel() {
        GianTrong model = new GianTrong();
        model.setMaDan(Integer.valueOf(txtMaDanTrong.getText()));
        model.setTenDan(txtTenDanTrong.getText());
        model.setTrangThai(Boolean.valueOf(txtTrangThai.getText()));
        return model;
    }

    GianTrong getModelInsert() {
        GianTrong model = new GianTrong();
        model.setTenDan(txtTenDanTrong.getText());
        return model;
    }

//    void updateStatus() {
//        
//        boolean edit = (this.index > -1);
//        boolean first = (this.index == 0);
//        boolean last = (this.index == tblGianTrong.getRowCount() - 1);
//        txtMaDanTrong.setEditable(!edit);
//        btnThem.setEnabled(!edit);
//        btnSua.setEnabled(edit);
//        btnXoa.setEnabled(edit);
//        btnFirst.setEnabled(edit && !first);
//        btnPrev.setEnabled(edit && !first);
//        btnNext.setEnabled(edit && !last);
//        btnLast.setEnabled(edit && !last);
//    }
    void setStatus(boolean insertable) {
        txtMaDanTrong.setEditable(insertable);
        btnThem.setEnabled(insertable);
        btnSua.setEnabled(!insertable);
        btnXoa.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tblGianTrong.getRowCount() - 1;

    }

    public boolean checkTrungMa(JTextField txt) {
        txt.setBackground(white);
        if (gtdao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(pink);
            MsgBox.alert(this, txt.getName() + " Đã tồn tại.");
            return false;
        }
    }

    public boolean checkTrungTen(JTextField txt) {
        txt.setBackground(white);
        if (gtdao.selectByTenGian(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(pink);
            MsgBox.alert(this, "Tên giàn đã tồn tại !");
            return false;
        }
    }

    private boolean validation() {
        if (txtTenDanTrong.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập tên dàn trồng !");
            txtTenDanTrong.requestFocus();
            return false;
        }
        if (txtTenDanTrong.getText().equalsIgnoreCase("Nhập tên dàn trồng !")) {
            MsgBox.alert(this, "Bạn chưa nhập tên dàn trồng !");
            txtTenDanTrong.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean checkTenGian(JTextField txt) {
        txt.setBackground(white);
        String id = txt.getText();
        String rgx = "[a-zA-Z_0-9]{1,15}";
        if (id.matches(rgx)) {
            return true;
        } else {
            txt.setBackground(pink);
            MsgBox.alert(txt.getRootPane(), "Tên giàn phải có 1-15 kí tự\nChữ hoa, thường không dấu hoặc số !");
            return false;
        }
    }

 

}
