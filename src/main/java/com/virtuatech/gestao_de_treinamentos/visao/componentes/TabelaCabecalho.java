
package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

class TabelaCabecalho extends JLabel{

    public TabelaCabecalho(String texto) {
        super(texto);
        setOpaque(true);
        setBackground(Color.WHITE);
        Font customFont = null;
        try{
            customFont = loadCustomFont("src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\util\\font\\PTSans-Bold.OTF", 13f);
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        if (customFont != null) {
           setFont(customFont);         
        }
        
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));
             
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        g.setColor(new Color(230,230,230));
        g.drawLine(0, getHeight() - 1, getWidth(), getHeight());
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
      
}
