
package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import com.virtuatech.gestao_de_treinamentos.visao.modelo.CartaoModelo;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;


public class Cartao extends javax.swing.JPanel {
    
    private Color cor1;
    private Color cor2;
    
    public Cartao() {
        initComponents();
        setOpaque(false);
        cor1 = Color.BLACK;
        cor2 = Color.WHITE;
    }
    
    public void setData(CartaoModelo cartaoModelo){
        imageCartaoLabel.setIcon(cartaoModelo.getIcon());
        tituloCartaoLabel.setText(cartaoModelo.getTitulo());
        valorCartaoLabel.setText(cartaoModelo.getValor());
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        GradientPaint gradientPaint = new GradientPaint(0, 0, cor1, 0, getHeight(), cor2);
        graphics2D.setPaint(gradientPaint);
        
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
        
        graphics2D.setColor(new Color(255, 255, 255, 50));
        graphics2D.fillOval(getWidth() - (getHeight()/2), 10, getHeight(), getHeight());
        graphics2D.fillOval(getWidth() - (getHeight()/(2)) - 20, getHeight()/2 + 20, getHeight(), getHeight());
        
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Color getCor1() {
        return cor1;
    }

    public Color getCor2() {
        return cor2;
    }

    public void setCor1(Color cor1) {
        this.cor1 = cor1;
    }

    public void setCor2(Color cor2) {
        this.cor2 = cor2;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageCartaoLabel = new javax.swing.JLabel();
        tituloCartaoLabel = new javax.swing.JLabel();
        valorCartaoLabel = new javax.swing.JLabel();

        tituloCartaoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloCartaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloCartaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloCartaoLabel.setText("Titulo");

        valorCartaoLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        valorCartaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorCartaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        valorCartaoLabel.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageCartaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloCartaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorCartaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(imageCartaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCartaoLabel)
                .addGap(18, 18, 18)
                .addComponent(valorCartaoLabel)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageCartaoLabel;
    private javax.swing.JLabel tituloCartaoLabel;
    private javax.swing.JLabel valorCartaoLabel;
    // End of variables declaration//GEN-END:variables
}
