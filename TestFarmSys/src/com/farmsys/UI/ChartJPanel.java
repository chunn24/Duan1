/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.Entity.Chart;
import com.farmsys.dao.ChartDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
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
public class ChartJPanel extends javax.swing.JPanel {

    public ChartJPanel() {
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
        pnlchart = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMinimumSize(new java.awt.Dimension(1083, 750));
        PanelTong.setPreferredSize(new java.awt.Dimension(1083, 750));

        pnlchart.setBackground(new java.awt.Color(255, 255, 255));
        pnlchart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addComponent(pnlchart, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlchart, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTong;
    private javax.swing.JPanel pnlchart;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.fillTableChart();
        this.showLineChart();
    }
    ChartDAO dao = new ChartDAO();
    Double Thang1, Thang2, Thang3, Thang4, Thang5, Thang6, Thang7, Thang8, Thang9, Thang10, Thang11, Thang12;

    void showLineChart() {

        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(Thang1, "Amount", "1");
        dataset.setValue(Thang2, "Amount", "2");
        dataset.setValue(Thang3, "Amount", "3");
        dataset.setValue(Thang4, "Amount", "4");
        dataset.setValue(Thang5, "Amount", "5");
        dataset.setValue(Thang6, "Amount", "6");
        dataset.setValue(Thang7, "Amount", "7");
        dataset.setValue(Thang8, "Amount", "8");
        dataset.setValue(Thang9, "Amount", "9");
        dataset.setValue(Thang10, "Amount", "10");
        dataset.setValue(Thang11, "Amount", "11");
        dataset.setValue(Thang12, "Amount", "12");

        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Tổng doanh thu", "Tháng", "VNĐ",
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

    private void fillTableChart() {
        Chart chart = new Chart();
        List<Chart> list = dao.selectAll();
        for (Chart nk : list) {
            Thang1 = nk.getThang1();
            Thang2 = nk.getThang2();
            Thang3 = nk.getThang3();
            Thang4 = nk.getThang4();
            Thang5 = nk.getThang5();
            Thang6 = nk.getThang6();
            Thang7 = nk.getThang7();
            Thang8 = nk.getThang8();
            Thang9 = nk.getThang9();
            Thang10 = nk.getThang10();
            Thang11 = nk.getThang11();
            Thang12 = nk.getThang12();

        }
    }

}