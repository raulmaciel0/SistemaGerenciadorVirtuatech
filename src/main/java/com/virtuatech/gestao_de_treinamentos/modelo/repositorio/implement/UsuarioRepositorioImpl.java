
package com.virtuatech.gestao_de_treinamentos.modelo.repositorio.implement;

import com.virtuatech.gestao_de_treinamentos.modelo.conexao.ConexaoMySQL;
import com.virtuatech.gestao_de_treinamentos.modelo.entidade.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

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
    
}
