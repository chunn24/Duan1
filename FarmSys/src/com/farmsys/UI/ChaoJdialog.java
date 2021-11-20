/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.Helper.JdbcHelper;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 *
 * @author NguyenTrung
 */
public class ChaoJdialog extends javax.swing.JDialog {

    /**
     * Creates new form chaoJdialog
     *
     * @param parent
     * @param modal
     */
    public ChaoJdialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        pgbLogging = new javax.swing.JProgressBar();
        lblanh2 = new javax.swing.JLabel();
        lblanh1 = new javax.swing.JLabel();
        lblanh3 = new javax.swing.JLabel();
        lblanh4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pgbLogging.setForeground(new java.awt.Color(0, 0, 0));
        pgbLogging.setStringPainted(true);
        PanelTong.add(pgbLogging, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 440, 670, 30));

        lblanh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 2.png"))); // NOI18N
        PanelTong.add(lblanh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 470, -1));

        lblanh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 1.png"))); // NOI18N
        PanelTong.add(lblanh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblanh3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 4.png"))); // NOI18N
        PanelTong.add(lblanh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        lblanh4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 5.png"))); // NOI18N
        PanelTong.add(lblanh4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 520, -1));

        getContentPane().add(PanelTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChaoJdialog dialog = new ChaoJdialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelTong;
    private javax.swing.JLabel lblanh1;
    private javax.swing.JLabel lblanh2;
    private javax.swing.JLabel lblanh3;
    private javax.swing.JLabel lblanh4;
    private javax.swing.JProgressBar pgbLogging;
    // End of variables declaration//GEN-END:variables

    private void init() {

        this.setLocationRelativeTo(null);
        pgbLogging.setForeground(Color.black);
        new Timer(40, (ActionEvent e) -> {
            int value = pgbLogging.getValue();
            if (value < pgbLogging.getMaximum()) {
                if (value <= 0) {
                    pgbLogging.setString("Đang vào chương trình....");
                }
                if (value >= 40) {
                    pgbLogging.setString("Đang vào chương trình....");
                }
                if (value >= 60) {
                    pgbLogging.setString("Đang kết nối với database....");
                }
                if (value == 70) {
                    pgbLogging.setString("Đang kết nối với database....");
                }
                if (value == 80) {

                    JdbcHelper.ConnectDAO();
                }
                pgbLogging.setValue(value + 5);
            } else {
                ChaoJdialog.this.dispose();

            }
        }).start();

    }

}
