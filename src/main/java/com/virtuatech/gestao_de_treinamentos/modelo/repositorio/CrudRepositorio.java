/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.virtuatech.gestao_de_treinamentos.modelo.repositorio;
public interface CrudRepositorio<T> {
    public boolean salvar(T t);
}
