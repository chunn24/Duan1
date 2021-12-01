/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import AppPackage.AnimationClass;
import com.farmsys.Helper.HandleAPI;
import com.farmsys.data.JsonResult;
import jaco.mp3.player.MP3Player;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author NguyenTrung
 */
public class WeatherJDialog extends javax.swing.JDialog {

    /**
     * Creates new form WeatherJDialog
     *
     * @param parent
     * @param modal
     */
    public WeatherJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        new Timer(1700, (ActionEvent e) -> {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
            AnimationClass anim = new AnimationClass();
            anim.jLabelXRight(lblload.getX(), 1000, 3, 1, lblload);
        }).start();

        this.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlweather = new javax.swing.JPanel();
        lblload = new javax.swing.JLabel();
        pnlchart = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblnhietdo = new javax.swing.JLabel();
        lblapxuat = new javax.swing.JLabel();
        lblcloud = new javax.swing.JLabel();
        lbldoam = new javax.swing.JLabel();
        lblnext = new javax.swing.JLabel();
        lblpre = new javax.swing.JLabel();
        lblweather = new javax.swing.JLabel();
        lblwind = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FarmSys's Weather");
        setLocationByPlatform(true);
        setModal(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlweather.setBackground(new java.awt.Color(51, 51, 51));
        pnlweather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlweatherMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlweatherMouseExited(evt);
            }
        });
        pnlweather.setLayout(null);

        lblload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/weather.gif"))); // NOI18N
        pnlweather.add(lblload);
        lblload.setBounds(0, 0, 800, 600);

        pnlchart.setBackground(new java.awt.Color(255, 255, 255,100));
        pnlchart.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlchart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlchart.setInheritsPopupMenu(true);
        pnlchart.setOpaque(false);
        pnlchart.setLayout(new javax.swing.BoxLayout(pnlchart, javax.swing.BoxLayout.LINE_AXIS));
        pnlweather.add(pnlchart);
        pnlchart.setBounds(50, 380, 700, 200);

        lblexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/cancel_30px.png"))); // NOI18N
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });
        pnlweather.add(lblexit);
        lblexit.setBounds(760, 10, 30, 30);

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText(":");
        pnlweather.add(lbldate);
        lbldate.setBounds(60, 100, 250, 40);

        lblcity.setBackground(new java.awt.Color(204, 204, 204));
        lblcity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 255, 255));
        lblcity.setText(":");
        pnlweather.add(lblcity);
        lblcity.setBounds(310, 100, 350, 40);

        lblnhietdo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblnhietdo.setForeground(new java.awt.Color(255, 255, 255));
        lblnhietdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_rain_cloud_30px_1.png"))); // NOI18N
        lblnhietdo.setText("27 C");
        pnlweather.add(lblnhietdo);
        lblnhietdo.setBounds(50, 200, 220, 40);

        lblapxuat.setBackground(new java.awt.Color(204, 204, 204));
        lblapxuat.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblapxuat.setForeground(new java.awt.Color(255, 255, 255));
        lblapxuat.setText(":");
        pnlweather.add(lblapxuat);
        lblapxuat.setBounds(240, 290, 180, 44);

        lblcloud.setBackground(new java.awt.Color(204, 204, 204));
        lblcloud.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblcloud.setForeground(new java.awt.Color(255, 255, 255));
        lblcloud.setText(":");
        pnlweather.add(lblcloud);
        lblcloud.setBounds(610, 290, 130, 43);

        lbldoam.setBackground(new java.awt.Color(204, 204, 204));
        lbldoam.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbldoam.setForeground(new java.awt.Color(255, 255, 255));
        lbldoam.setText(":");
        pnlweather.add(lbldoam);
        lbldoam.setBounds(430, 290, 170, 44);

        lblnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_next_30px.png"))); // NOI18N
        lblnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblnextMouseClicked(evt);
            }
        });
        pnlweather.add(lblnext);
        lblnext.setBounds(760, 460, 30, 30);

        lblpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_previous_30px_1.png"))); // NOI18N
        lblpre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblpre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpreMouseClicked(evt);
            }
        });
        pnlweather.add(lblpre);
        lblpre.setBounds(10, 460, 40, 30);

        lblweather.setBackground(new java.awt.Color(204, 204, 204));
        lblweather.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        lblweather.setForeground(new java.awt.Color(255, 255, 255));
        lblweather.setText("rain");
        pnlweather.add(lblweather);
        lblweather.setBounds(320, 200, 210, 40);

        lblwind.setBackground(new java.awt.Color(204, 204, 204));
        lblwind.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblwind.setForeground(new java.awt.Color(255, 255, 255));
        lblwind.setText(":");
        pnlweather.add(lblwind);
        lblwind.setBounds(60, 290, 170, 44);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/rain.jpg"))); // NOI18N
        pnlweather.add(background);
        background.setBounds(-6, -6, 810, 610);

        getContentPane().add(pnlweather, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnextMouseClicked
        idx = idx == 39 ? idx : idx + 1;
        setThoiTiet();
    }//GEN-LAST:event_lblnextMouseClicked

    private void lblpreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpreMouseClicked
        idx = idx == 0 ? idx : idx - 1;
        setThoiTiet();
    }//GEN-LAST:event_lblpreMouseClicked

    private void pnlweatherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlweatherMouseClicked

    }//GEN-LAST:event_pnlweatherMouseClicked

    private void pnlweatherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlweatherMouseExited

    }//GEN-LAST:event_pnlweatherMouseExited

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        this.dispose();
        music.stop();
    }//GEN-LAST:event_lblexitMouseClicked

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
            java.util.logging.Logger.getLogger(WeatherJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WeatherJDialog dialog = new WeatherJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel background;
    private javax.swing.JLabel lblapxuat;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcloud;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldoam;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblload;
    private javax.swing.JLabel lblnext;
    private javax.swing.JLabel lblnhietdo;
    private javax.swing.JLabel lblpre;
    private javax.swing.JLabel lblweather;
    private javax.swing.JLabel lblwind;
    private javax.swing.JPanel pnlchart;
    private javax.swing.JPanel pnlweather;
    // End of variables declaration//GEN-END:variables

    MP3Player music = new MP3Player(new File("src\\Sounds\\raining.mp3"));

    private JsonResult result;
    private int idx = 0;

    private void init() {
        result = HandleAPI.getJsonData((String) "Saigon");
        setThoiTiet();
        setLocationRelativeTo(this);
        this.showLineChart();
    }

    void setThoiTiet() {
        String date = " Ngày: " + result.getList()[idx].getDt_txt();
        String city = " Thành phố: " + result.getCity().getName();
        String weath = result.getList()[idx].getWeather()[0].getDescription();
        String nhietDo = result.getList()[idx].getMain().getTemp() + " °";
        String apXuat = " Áp xuất: " + result.getList()[idx].getMain().getPresure() + " Pa";
        String doAm = " Độ ẩm: " + result.getList()[idx].getMain().getHumidity() + " %";
        String clouds = " Mây: " + result.getList()[idx].getClouds().getAll() + " %";
        String wind = "Gió: " + result.getList()[idx].getWind().getSpeed() + " km/h";

        lblapxuat.setText(apXuat);
        lblcity.setText(city);
        lblcloud.setText(clouds);
        lbldate.setText(date);
        lbldoam.setText(doAm);
        lblnhietdo.setText(nhietDo);
        lblweather.setText(weath);
        lblwind.setText(wind);

        String text = lblweather.getText();
        if (text.contains("clouds")) {
            lblnhietdo.setIcon(new ImageIcon("src\\com\\farmsys\\icons\\cloud_30px.png"));
            background.setIcon(new ImageIcon("src\\com\\farmsys\\icons\\may.jpg"));

        } else if (text.contains("sun")) {
            lblnhietdo.setIcon(new ImageIcon("src\\com\\farmsys\\icons\\icons8_summer_30px.png"));
            background.setIcon(new ImageIcon("src\\com\\farmsys\\icons\\nangsaigon.jpg"));

        } else if (text.contains("rain")) {
            lblnhietdo.setIcon(new ImageIcon("src\\com\\farmsys\\icons\\icons8_rain_cloud_30px_1.png"));
            background.setIcon(new ImageIcon("src\\com\\farmsys\\icons\\rain.jpg"));
            music.play();
        }
    }

    void showLineChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Double nhietDo;
        String date;

        for (idx = 0; idx < 39; idx = idx + 3) {

            nhietDo = result.getList()[idx].getMain().getTemp();
            date = result.getList()[idx].getDt_txt();
            int i = date.indexOf(' ');
            String xuat = date.substring(i + 1);
            System.out.println(nhietDo);
            System.out.println(xuat);
            dataset.setValue(nhietDo, "Amount", xuat);
        }

        //create dataset for the graph
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Nhiệt độ trung bình", "Giờ", "Độ C",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        //create plot object
        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
        // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);

        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204, 0, 51);
        lineRenderer.setSeriesPaint(0, lineChartColor);

        //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        pnlchart.removeAll();
        pnlchart.add(lineChartPanel, BorderLayout.CENTER);
        pnlchart.validate();
    }
}
