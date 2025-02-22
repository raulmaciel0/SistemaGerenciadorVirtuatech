package com.virtuatech.gestao_de_treinamentos.visao.componentes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Tabela extends JTable{

    public Tabela() {
        setShowHorizontalLines(true);
        setRowHeight(30);
        setGridColor(new Color(230,230,230));
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TabelaCabecalho cabecalho = new TabelaCabecalho(value + "");
                return cabecalho;
            }
            
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                component.setForeground(new Color(102,102,102));
                
                if(isSelected){
                    component.setForeground(new Color(13,113,182));
                }
                return component;
            }
            
            
        });
    }
    
}
