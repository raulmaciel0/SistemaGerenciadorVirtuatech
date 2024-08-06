/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.virtuatech.gestao_de_treinamentos.modelo.servico;

import com.virtuatech.gestao_de_treinamentos.modelo.entidade.Usuario;
import com.virtuatech.gestao_de_treinamentos.modelo.repositorio.implement.UsuarioRepositorioImpl;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Renato
 */
public class UsuarioServico {
    private UsuarioRepositorioImpl usuarioRepositorio;

    public UsuarioServico() {
        usuarioRepositorio = new UsuarioRepositorioImpl();
    }
    
    public String login(String email, String senha){
        Optional usuarioOptional = usuarioRepositorio.buscarPeloEmail(email);
        
        if (usuarioOptional.isPresent()){
            Usuario usuario = (Usuario) usuarioOptional.get();
            
            if(validaSenha(senha, usuario.getSenha())){
                if(!usuario.getEstado()){
                    return "Usuario Bloqueado. Procurar administrador.";
                }
                
                return "Dados corretos!";
            }
            
            return "Dados incorretos!";
        }
        
        return "Usuario inexistente...";
    }
    
    public boolean validaSenha(String senhaInserida, String senhaUsuario){
        return new BCryptPasswordEncoder().matches(senhaInserida, senhaUsuario);
    }
}
