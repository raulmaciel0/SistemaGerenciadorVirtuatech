package com.virtuatech.gestao_de_treinamentos.visao.modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MenuModelo {
    private String icon;
    private String nome;
    private TipoMenu tipoMenu;
    
    public enum TipoMenu{
        MENU, TITULO, VAZIO;
    }
    
    public Icon toIcon(){
        return new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\com\\virtuatech\\gestao_de_treinamentos\\visao\\icon\\" + icon + ".png");
    }
}
