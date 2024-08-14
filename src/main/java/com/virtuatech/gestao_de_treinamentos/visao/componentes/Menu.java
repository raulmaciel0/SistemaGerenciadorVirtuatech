
package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import com.virtuatech.gestao_de_treinamentos.visao.modelo.MenuModelo;
import static com.virtuatech.gestao_de_treinamentos.visao.modelo.MenuModelo.TipoMenu.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;


public class Menu extends javax.swing.JPanel {

    
    public Menu() {
        initComponents();
        setOpaque(false);
        listaMenu1.setOpaque(false);
        inicializarMenu();
        
        Font customFont = null;
        try{
            customFont = loadCustomFont("src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\util\\font\\PTSans-Bold.OTF", 13f);
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        if (customFont != null) {
            cargoLabel.setFont(customFont);
            nomeDeUsuarioLabel.setFont(customFont);
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
    
    private void inicializarMenu(){
        listaMenu1.adicionarItem(new MenuModelo("1", "Dashboard", MENU));
        listaMenu1.adicionarItem(new MenuModelo("3", "Treinamento", MENU));
        listaMenu1.adicionarItem(new MenuModelo("6", "Cadastro Colaborador", MENU));
        listaMenu1.adicionarItem(new MenuModelo("4", "Iniciar Treinamento", MENU));
        listaMenu1.adicionarItem(new MenuModelo("8", "Relatórios", MENU));
        listaMenu1.adicionarItem(new MenuModelo("5", "Backup", MENU));
        
        listaMenu1.adicionarItem(new MenuModelo("", " ", VAZIO));
        
        listaMenu1.adicionarItem(new MenuModelo("", "Suporte", TITULO));
        listaMenu1.adicionarItem(new MenuModelo("9", "Fale Conosco", MENU));
        listaMenu1.adicionarItem(new MenuModelo("10", "Sair", MENU));
        
        
        
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
        cargoLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nomeDeUsuarioLabel = new javax.swing.JLabel();
        listaMenu1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.ListaMenu<>();
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
        add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 70));

        cargoLabel.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargoLabel.setText("Cargo");
        add(cargoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, -1));

        jSeparator2.setBackground(new java.awt.Color(69, 30, 161));
        jSeparator2.setForeground(new java.awt.Color(69, 30, 161));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, 220, 10));

        nomeDeUsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeDeUsuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeDeUsuarioLabel.setText("Nome do Usuario");
        add(nomeDeUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));

        listaMenu1.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        add(listaMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 410));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\icon\\menuVirtuatech.png")); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cargoLabel;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.ListaMenu<String> listaMenu1;
    private javax.swing.JLabel nomeDeUsuarioLabel;
    // End of variables declaration//GEN-END:variables
}
