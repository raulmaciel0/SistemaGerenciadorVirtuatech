
package com.virtuatech.gestao_de_treinamentos.visao.formulario;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;


public class Login extends javax.swing.JFrame {
    
    private MigLayout layout;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        
        layout = new MigLayout("fill, insets");
        background.setLayout(layout);
        
        background.add(panelBoard1, "pos 0 0 100% 100%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoard1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.PanelBoard();
        jPanel1 = new javax.swing.JPanel();
        campoDeTexto1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.CampoDeTexto();
        campoDeSenha1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.CampoDeSenha();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botao1 = new com.virtuatech.gestao_de_treinamentos.visao.componentes.Botao();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLayeredPane();

        panelBoard1.setCor1(new java.awt.Color(51, 0, 153));
        panelBoard1.setCor2(new java.awt.Color(69, 30, 161));
        panelBoard1.setMinimumSize(new java.awt.Dimension(412, 290));
        panelBoard1.setPreferredSize(new java.awt.Dimension(412, 290));
        panelBoard1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelBoard1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 0, -1, -1));

        campoDeTexto1.setCor(new java.awt.Color(255, 255, 255));
        campoDeTexto1.setDicas("Colaborador");
        campoDeTexto1.setPrefixoIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\icon\\user.png")); // NOI18N
        campoDeTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTexto1ActionPerformed(evt);
            }
        });
        panelBoard1.add(campoDeTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, -1));

        campoDeSenha1.setCor(new java.awt.Color(255, 255, 255));
        campoDeSenha1.setDicas("Senha");
        campoDeSenha1.setPrefixoIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\icon\\pass.png")); // NOI18N
        panelBoard1.add(campoDeSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 260, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\icon\\virtualogoWhite.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1014, 889));
        jLabel1.setMinimumSize(new java.awt.Dimension(1014, 889));
        panelBoard1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 100, -1));
        panelBoard1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelBoard1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 0, -1, -1));

        botao1.setBackground(new java.awt.Color(51, 0, 102));
        botao1.setForeground(new java.awt.Color(204, 204, 204));
        botao1.setText("Login");
        botao1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        panelBoard1.add(botao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 260, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        panelBoard1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 33, 25));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\temp\\ws-netbeans-22\\gestao_de_treinamentos\\src\\icon\\001.png")); // NOI18N
        panelBoard1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 320));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Renato\\Downloads\\icon\\001.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDeTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTexto1ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.Botao botao1;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.CampoDeSenha campoDeSenha1;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.CampoDeTexto campoDeTexto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.virtuatech.gestao_de_treinamentos.visao.componentes.PanelBoard panelBoard1;
    // End of variables declaration//GEN-END:variables
}
