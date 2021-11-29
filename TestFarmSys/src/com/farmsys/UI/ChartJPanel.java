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
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

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
        pnlcharttron = new javax.swing.JPanel();
        pnlchartcot = new javax.swing.JPanel();
        pnlchartnhietdo = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMinimumSize(new java.awt.Dimension(1083, 750));
        PanelTong.setPreferredSize(new java.awt.Dimension(1083, 750));

        pnlchart.setBackground(new java.awt.Color(255, 255, 255));
        pnlchart.setLayout(new java.awt.BorderLayout());

        pnlcharttron.setBackground(new java.awt.Color(255, 255, 255));
        pnlcharttron.setLayout(new java.awt.BorderLayout());

        pnlchartcot.setBackground(new java.awt.Color(255, 255, 255));
        pnlchartcot.setLayout(new java.awt.BorderLayout());

        pnlchartnhietdo.setBackground(new java.awt.Color(255, 255, 255));
        pnlchartnhietdo.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addComponent(pnlchart, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlcharttron, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addComponent(pnlchartcot, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlchartnhietdo, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlcharttron, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlchart, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlchartcot, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlchartnhietdo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
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
    private javax.swing.JPanel pnlchartcot;
    private javax.swing.JPanel pnlchartnhietdo;
    private javax.swing.JPanel pnlcharttron;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.fillTableChart();
        this.showLineChart();
        this.showPieChart();
        this.showHistogram();
        this.showBarChart();
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

    public void showPieChart() {

        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("IPhone 5s", new Double(20));
        barDataset.setValue("SamSung Grand", new Double(20));
        barDataset.setValue("MotoG", new Double(40));
        barDataset.setValue("Nokia Lumia", new Double(10));

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("mobile sales", barDataset, false, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
        piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        pnlcharttron.removeAll();
        pnlcharttron.add(barChartPanel, BorderLayout.CENTER);
        pnlcharttron.validate();
    }

    public void showHistogram() {

        double[] values = {0, 0, 0, 59, 50, 66, 47, 40, 1, 67,
            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
            77, 44, 58, 91, 10, 67, 57, 19, 88, 84
        };

        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);

        JFreeChart chart = ChartFactory.createHistogram("JFreeChart Histogram", "Data", "Frequency", dataset, PlotOrientation.VERTICAL, false, true, false);
        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        pnlchartnhietdo.removeAll();
        pnlchartnhietdo.add(barpChartPanel2, BorderLayout.CENTER);
        pnlchartnhietdo.validate();
    }

    public void showBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");

        JFreeChart chart = ChartFactory.createBarChart("contribution", "monthly", "amount",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        pnlchartcot.removeAll();
        pnlchartcot.add(barpChartPanel, BorderLayout.CENTER);
        pnlchartcot.validate();
    }
}
