/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.virtuatech.gestao_de_treinamentos.modelo.repositorio.implement;

import com.virtuatech.gestao_de_treinamentos.modelo.conexao.ConexaoMySQL;
import com.virtuatech.gestao_de_treinamentos.modelo.repositorio.CrudRepositorio;
import com.virtuatech.gestao_de_treinamentos.modelo.util.SQLFormato;
import com.virtuatech.gestao_de_treinamentos.modelo.util.SQLFormatoAtualizar;
import com.virtuatech.gestao_de_treinamentos.modelo.util.SQLFormatoInserir;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.ReflectionUtils;

public abstract class CrudRepositorioImplement<T> implements CrudRepositorio<T>{

    private Class<T> t;

    public CrudRepositorioImplement(Class<T> t) {
        this.t = t;
    }
    
    
    
    @Override
    public boolean salvar(T t) {                                                //Ao tentar salvar um dado, eu preciso verificar se o id está preenchido ou não
        Object id = null;
        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);       //Pegamos todos os dados da classe em questão
        
        try {
            for(Field campo : campos){
            campo.setAccessible(true);
            if(campo.getName().equalsIgnoreCase("id")){
                id = campo.get(t);                                              //verifica-se se ha algo no campo id, ou seja, se não tiver faremos uma inserção,
            }                                                                   //se houver faremos um update
        }
        
        if(id == null){
            SQLFormato sql = new SQLFormatoInserir(this.t);                     //Essa classe permite a formatação de SQL para Insert
            return persistencia(sql.formato(), t, false);                       //aqui faremos a persistencia do dado
        }
        
        SQLFormato sql = new SQLFormatoAtualizar(this.t);                       //caso não seja nulo ou seja precise atualizar buscaremos a query do sql                                                             
        return persistencia(sql.formato(), t, true);                            //aqui persistimos a atualização  
        
                                                                                
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private boolean persistencia(String sql, Object t, boolean atualizar){
        try {
            PreparedStatement ps = ConexaoMySQL.obterConexao().prepareStatement(sql);
            
            preencherPreparedStatement(t, ps, atualizar);
            
            int resultado = ps.executeUpdate();
            
            return resultado == 1;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
        
        
    private void preencherPreparedStatement(Object t, PreparedStatement ps, boolean atualizar){
        int contador = 1;
        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);
        
        try {
            for(Field campo : campos){
                campo.setAccessible(true);
                if(atualizar && campo.getName().equalsIgnoreCase("id")){
                    ps.setObject(campos.size(), campo.get(t));
                    continue;
                }
                
                ps.setObject(contador, campo.get(t));
                contador++;
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<T> buscarTodos() {
        List<T> lista = new ArrayList<>();
        try {
            String SQL = String.format("SELECT * FROM %s", t.getSimpleName());
            ResultSet resultSet = ConexaoMySQL.obterConexao().prepareStatement(SQL)
                    .executeQuery();
            
            while(resultSet.next()){
                lista.add(getT(resultSet));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        return lista;
        
        
    }

    private T getT(ResultSet resultSet){
        try {
            T tNovo = t.newInstance();
            Method metodo = null;
            Set<Field> campos = ReflectionUtils.getAllFields(t, e -> true);
            
            for(Field campo : campos){
                Object valor = null;
                String nome = campo.getName();
                
                switch (campo.getType().getSimpleName().toUpperCase()) {
                    case "STRING" -> {
                        valor = resultSet.getString(nome);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome), String.class);
                    }
                    
                    case "LONG" -> {
                        valor = resultSet.getLong(nome);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome),  Long.class);
                    }
                    case "INTEGER" -> {
                        valor = resultSet.getInt(nome);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome),  Integer.class);
                    }
                    case "BOOLEAN" -> {
                        valor = resultSet.getBoolean(nome);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome),  Boolean.class);
                    }
                    case "Object" -> {
                        valor = resultSet.getObject(nome);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome),  Object.class);
                    }
                    
                    case "LOCALDATETIME" -> {
                        valor = resultSet.getObject(nome, LocalDateTime.class);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome),  LocalDateTime.class);
                    }
                    
                    case "BIGDECIMAL" -> {
                        valor = resultSet.getBigDecimal(nome);
                        metodo = t.getMethod("set" + primeiraLetraMaiuscula(nome),  BigDecimal.class);
                    } 
                }
                
                metodo.invoke(tNovo, valor);
            }
            
            return tNovo;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private String primeiraLetraMaiuscula(String texto){
        if(!texto.isBlank()){
            return texto.substring(0, 1).toUpperCase().concat(texto.substring(1));
        }
        
        return "";
    }
    
}
