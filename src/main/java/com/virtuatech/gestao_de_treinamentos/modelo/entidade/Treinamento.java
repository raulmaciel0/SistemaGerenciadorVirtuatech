/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.virtuatech.gestao_de_treinamentos.modelo.entidade;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Treinamento {
    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime data_criacao;
    private Long usuario_id;
    private Long categoria_id;
}
