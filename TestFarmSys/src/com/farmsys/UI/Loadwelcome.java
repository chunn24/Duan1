/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import AppPackage.AnimationClass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author NguyenTrung
 */
public class Loadwelcome extends javax.swing.JDialog {

    /**
     * Creates new form Loadwelcome
     *
     * @param parent
     * @param modal
     */
    public Loadwelcome(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn2 = new javax.swing.JLabel();
        pn1 = new javax.swing.JLabel();
        pn3 = new javax.swing.JLabel();
        pn4 = new javax.swing.JLabel();
        welcom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 2.png"))); // NOI18N
        jPanel1.add(pn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -9, 460, 380));

        pn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 1.png"))); // NOI18N
        jPanel1.add(pn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 480, 340));

        pn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 4.png"))); // NOI18N
        jPanel1.add(pn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 460, 340));

        pn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/Path 5.png"))); // NOI18N
        jPanel1.add(pn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 610, 300));

        welcom.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        welcom.setText("Welcome to FarmSys");
        jPanel1.add(welcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 350, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

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
            java.util.logging.Logger.getLogger(Loadwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loadwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loadwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loadwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Loadwelcome dialog = new Loadwelcome(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pn1;
    private javax.swing.JLabel pn2;
    private javax.swing.JLabel pn3;
    private javax.swing.JLabel pn4;
    private javax.swing.JLabel welcom;
    // End of variables declaration//GEN-END:variables

    private void init2() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        AnimationClass anim = new AnimationClass();

        anim.jLabelXLeft(pn1.getX(), -1000, 2, 1, pn1);

        anim.jLabelXRight(pn2.getX(), 1000, 3, 1, pn2);

        anim.jLabelXRight(pn3.getX(), 1000, 2, 1, pn3);

        anim.jLabelYDown(pn4.getY(), 1000, 2, 1, pn4);
        new Timer(5000, (ActionEvent e) -> {
            this.dispose();
        }).start();
    }
}
