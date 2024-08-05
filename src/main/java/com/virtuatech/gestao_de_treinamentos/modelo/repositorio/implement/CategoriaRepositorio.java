
package com.virtuatech.gestao_de_treinamentos.modelo.repositorio.implement;

import com.virtuatech.gestao_de_treinamentos.modelo.entidade.Categoria;

public class CategoriaRepositorio extends CrudRepositorioImplement{

    public CategoriaRepositorio() {
        super(Categoria.class);
    }
    
    public static void main(String[] args) {
        Categoria categoria = Categoria.builder()
                .id(4L)
                .nome("Teste")
                .descricao("testagem")
                .build();
        
        
        
        CategoriaRepositorio repositorio = new CategoriaRepositorio();
        System.out.println("Resultado: " + repositorio.removerPeloID(4L));
    }
}
