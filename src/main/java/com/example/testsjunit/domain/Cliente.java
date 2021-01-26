package com.example.testsjunit.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String email;
    private boolean ativo;
    private int idContaCorrente;

}
