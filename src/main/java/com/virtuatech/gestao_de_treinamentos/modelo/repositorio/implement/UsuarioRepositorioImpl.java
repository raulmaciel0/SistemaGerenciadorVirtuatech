
package com.virtuatech.gestao_de_treinamentos.modelo.repositorio.implement;

import com.virtuatech.gestao_de_treinamentos.modelo.conexao.ConexaoMySQL;
import com.virtuatech.gestao_de_treinamentos.modelo.entidade.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

 public class UsuarioRepositorioImpl extends CrudRepositorioImplement{

    public UsuarioRepositorioImpl() {
        super(Usuario.class);
    }
    
    
    public Optional<Object> buscarPeloEmail(String email){
        try {
           String SQL = "SELECT * FROM usuario WHERE email = ?";
            PreparedStatement ps = ConexaoMySQL.obterConexao().prepareStatement(SQL);
            ps.setString(1, email);
            ResultSet resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                return Optional.ofNullable(getT(resultSet));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return Optional.empty();
    }
    
     public static void main(String[] args) {
         Usuario usuario = Usuario.builder()
                 .nome("Raul Germino Maciel")
                 .email("raul@gmail.com")
                 .senha(new BCryptPasswordEncoder().encode("2020"))
                 .perfil("PADRAO")
                 .dataCriacao(LocalDateTime.now())
                 .cargo("Estagiario")
                 .estado(true)
                 .build();
         
         UsuarioRepositorioImpl rep = new UsuarioRepositorioImpl();
         rep.salvar(usuario);
     }
}
