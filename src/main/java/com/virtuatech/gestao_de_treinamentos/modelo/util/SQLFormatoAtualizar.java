/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.virtuatech.gestao_de_treinamentos.modelo.util;

import java.lang.reflect.Field;
import java.util.Set;
import org.reflections.ReflectionUtils;

/**
 *
 * @author Renato
 */
public class SQLFormatoAtualizar<T> implements SQLFormato{
    private Class<T> t;

    public SQLFormatoAtualizar(Class<T> t) {
        this.t = t;
    }
    
    
    @Override
    public String formato() {                
        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);
        StringBuilder atributos = new StringBuilder();
        
        try{
            for(Field campo : campos){
                if(campo.getName().equalsIgnoreCase("id")) continue;
                atributos.append(campo.getName()).append("=?,");
            } 
            
            String atributo = removerUltimoCaracter(atributos.toString());
            String SQL = String.format("UPDATE %s SET %s WHERE id = ?" , t.getSimpleName(), atributo);
            
            System.out.println("SQL -->>>" + SQL);
            
            return SQL;
            
        }catch(Exception e){
            throw new RuntimeException(e);
        }      
        
    }

    private String removerUltimoCaracter(String texto){
        if(!texto.isBlank()){
            return texto.substring(0, texto.length() -1);
        }
        throw new RuntimeException("Texto vazio!");
    }
    
}

