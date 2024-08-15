package com.virtuatech.gestao_de_treinamentos.visao.formulario;

import java.awt.Color;
import javax.swing.JComponent;

public class Dashboard extends javax.swing.JFrame {
    
    private FormularioPrincipal formularioPrincipal;
    
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        inicializarFormulario();
        
        
        setForm(formularioPrincipal);
    }
    
    private void inicializarFormulario(){
        formularioPrincipal = new FormularioPrincipal();
    }
    
    private void setForm(JComponent component){
        painelPrincipal.removeAll();
        painelPrincipal.add(component);
        painelPrincipal.repaint();
        painelPrincipal.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoard1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.PanelBoard();
        menu1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.Menu();
        cabecalho2 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.Cabecalho();
        painelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBoard1Layout = new javax.swing.GroupLayout(panelBoard1);
        panelBoard1.setLayout(panelBoard1Layout);
        panelBoard1Layout.setHorizontalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cabecalho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelBoard1Layout.setVerticalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabecalho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.Cabecalho cabecalho2;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.Menu menu1;
    private javax.swing.JPanel painelPrincipal;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.PanelBoard panelBoard1;
    // End of variables declaration//GEN-END:variables
}
