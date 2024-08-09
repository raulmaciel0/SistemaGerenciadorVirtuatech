
package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu extends javax.swing.JPanel {

    
    public Menu() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.decode("#330099"), 0, getHeight(), Color.decode("#451EA1"));
        graphics2D.setPaint(gradientPaint);
        
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
        graphics2D.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        
        
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imageAvatar1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\icon\\virtualogoWhite.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 90));

        jSeparator1.setBackground(new java.awt.Color(69, 30, 161));
        jSeparator1.setForeground(new java.awt.Color(69, 30, 161));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 298, -1));

        imageAvatar1.setBorderColor(new java.awt.Color(255, 255, 255));
        imageAvatar1.setBorderSize(1);
        imageAvatar1.setImage(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\icon\\imageWorkerClose.png")); // NOI18N
        add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cargo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        jSeparator2.setBackground(new java.awt.Color(69, 30, 161));
        jSeparator2.setForeground(new java.awt.Color(69, 30, 161));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 298, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome do Usuario");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\icon\\menuVirtuatech.png")); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
