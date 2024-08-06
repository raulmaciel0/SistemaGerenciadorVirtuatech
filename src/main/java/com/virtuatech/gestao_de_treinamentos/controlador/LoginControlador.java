
package com.virtuatech.gestao_de_treinamentos.controlador;

import com.virtuatech.gestao_de_treinamentos.visao.componentes.Mensagem;
import com.virtuatech.gestao_de_treinamentos.visao.formulario.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginControlador implements ActionListener{
    private Login login;

    public LoginControlador(Login login) {
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "login" -> login();
            
        }
    }
    
    private void login(){
        login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.ERRO, "TESTE");
    }
    
    
}
