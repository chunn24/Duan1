package com.farmsys.Shadow;

import com.farmsys.Shadow.ShadowRenderer;
import com.farmsys.Entity.List;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;

public class PanelDetail extends javax.swing.JPanel {

    public PanelDetail() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g = (Graphics2D) grphcs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BufferedImage img = new BufferedImage(getWidth() - 10, 250, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = img.getWidth();
        int height = img.getHeight() - 1;
        int radius = 25;
        g2.setColor(new Color(14, 251, 137));
        Path2D.Float f = new Path2D.Float();
        f.moveTo(0, radius);
        f.curveTo(0, radius, 0, 0, radius, 0);
        f.lineTo(width - radius, 0);
        f.curveTo(width - radius, 0, width, 0, width - 5, radius);
        f.lineTo(width - 7, height - radius);
        f.curveTo(width - 7, height - radius, width - 7 - 2, height, width - radius - 20, height);
        f.lineTo(0, height);
        g2.fill(f);
        int px[] = {0, 25, 25};
        int py[] = {height, height + 30, height};
        g.setColor(new Color(14, 251, 137));
        g.fillPolygon(px, py, px.length);
        //  Create Shadow
        g.drawImage(new ShadowRenderer(10, 0.5f, Color.BLACK).createShadow(img), -5, 5, width + 10, height + 5, null);
        g.drawImage(img, 0, 0, null);
        super.paintComponent(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
