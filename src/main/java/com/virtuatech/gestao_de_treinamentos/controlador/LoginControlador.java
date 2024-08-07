
package com.virtuatech.gestao_de_treinamentos.controlador;

import com.virtuatech.gestao_de_treinamentos.modelo.servico.UsuarioServico;
import com.virtuatech.gestao_de_treinamentos.visao.componentes.Mensagem;
import com.virtuatech.gestao_de_treinamentos.visao.formulario.Dashboard;
import com.virtuatech.gestao_de_treinamentos.visao.formulario.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginControlador implements ActionListener{
    private Login login;
    private UsuarioServico usuarioServico;

    public LoginControlador(Login login) {
        this.login = login;
        usuarioServico = new UsuarioServico();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "login" -> login();
            
        }
    }
    
    private void login(){
        validarCampo();
        String email = login.getCampoDeTextoColaborador().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());
        
        String mensagem = usuarioServico.login(email, senha);
        
        if(mensagem.startsWith("Dados corretos!")){
            login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.SUCESSO, mensagem);
            login.getPanelCarregar().setVisible(true);
            
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                    limparCampo();
                    login.setVisible(false);
                    new Dashboard().setVisible(true);
                } catch (Exception e) {
                   
                }
            }).start();
            
        }else{
            login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.ERRO, mensagem);
        }
               
    }
    
    private void validarCampo(){
        String email = login.getCampoDeTextoColaborador().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());
        
        if(email.isBlank() || senha.isBlank()){
            String mensagem = "Dados sao obrigatorios";
            
            login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.ERRO, mensagem);
            throw new RuntimeException(mensagem);
        }
    }
    
    private void limparCampo(){
        login.getCampoDeTextoColaborador().setText("");
        login.getCampoDeSenha().setText("");
    }
}
