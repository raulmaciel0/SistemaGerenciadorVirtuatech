
package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mensagem extends javax.swing.JPanel {
    
    private TipoMensagem tipoMensagem;
    private boolean mostrar;
    
    public Mensagem() {
        initComponents();
        setVisible(false);
        setOpaque(false);
    }
    
    public enum TipoMensagem{
    SUCESSO, ERRO
    }
    
    public void mostrarMensagem(TipoMensagem tipo, String mensagem){
           this.tipoMensagem = tipo;
           labelMensagem.setText(mensagem);
           
           String caminho = System.getProperty("user.dir") + "\\src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\icon\\";
           
           if(tipo.equals(tipo.SUCESSO)){
               labelMensagem.setIcon(new ImageIcon(caminho + "sucesso.png"));
           }else{
               labelMensagem.setIcon(new ImageIcon(caminho + "erro.png"));
           }
           
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        if (this.tipoMensagem == TipoMensagem.SUCESSO){
            graphics2D.setColor(new Color(15, 174, 34));
        }else{
            graphics2D.setColor(new Color(197,42,43));
        }
        
        graphics2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f));
        
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        graphics2D.setComposite(AlphaComposite.SrcOver);
        graphics2D.setColor(new Color(245,245,245));
        graphics2D.drawRect(0, 0, getWidth() - 1, getHeight());
        
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public boolean isMostrar() {
        return mostrar;
    }

    public void setMostrar(boolean mostrar) {
        this.mostrar = mostrar;
    }

    public JLabel getLabelMensagem() {
        return labelMensagem;
    }

    public void setLabelMensagem(JLabel labelMensagem) {
        this.labelMensagem = labelMensagem;
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMensagem = new javax.swing.JLabel();

        labelMensagem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMensagem.setForeground(new java.awt.Color(255, 255, 255));
        labelMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMensagem.setText("Mensagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelMensagem;
    // End of variables declaration//GEN-END:variables
}
