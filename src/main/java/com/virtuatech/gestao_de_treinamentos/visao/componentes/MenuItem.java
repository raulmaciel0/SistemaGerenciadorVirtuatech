
package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import com.virtuatech.gestao_de_treinamentos.visao.modelo.MenuModelo;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

public class MenuItem extends javax.swing.JPanel {

    private boolean selecionado;
    private boolean over;
    
    public MenuItem(MenuModelo menuModelo) {
        initComponents();
        setOpaque(over);
        
        Font customFont = null;
        try{
            customFont = loadCustomFont("src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\util\\font\\PTSans-Bold.OTF", 13f);
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        switch (menuModelo.getTipoMenu()) {
            case MENU -> {
                LabelMenuItemIcon.setIcon(menuModelo.toIcon());
                LabelMenuItemTexto.setText(menuModelo.getNome());
                if (customFont != null) {
                    LabelMenuItemTexto.setFont(customFont);
                    
                }
            }
            case TITULO -> {
                LabelMenuItemIcon.setText(menuModelo.getNome());
                LabelMenuItemIcon.setForeground(Color.WHITE);
                LabelMenuItemTexto.setVisible(false);
            }
            
            case VAZIO -> {
                LabelMenuItemTexto.setText("");
            }
            
        }
    }
    
    private Font loadCustomFont(String path, float size) throws IOException {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(path));
            return font.deriveFont(Font.PLAIN, size);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        
        if(selecionado || over){
            Graphics2D  graphics2D = (Graphics2D) g;
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            if(selecionado) {
                graphics2D.setColor(new Color(85, 0, 205));
            }else{
                graphics2D.setColor(new Color(85, 0, 205));
            }
                graphics2D.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
        repaint();
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMenuItemIcon = new javax.swing.JLabel();
        LabelMenuItemTexto = new javax.swing.JLabel();

        LabelMenuItemTexto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        LabelMenuItemTexto.setForeground(new java.awt.Color(255, 255, 255));
        LabelMenuItemTexto.setText("MenuItem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelMenuItemIcon)
                .addGap(18, 18, 18)
                .addComponent(LabelMenuItemTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelMenuItemIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMenuItemTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMenuItemIcon;
    private javax.swing.JLabel LabelMenuItemTexto;
    // End of variables declaration//GEN-END:variables


}
