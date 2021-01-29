package com.example.testsjunit.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String email;
    private boolean ativo;
    private int idContaCorrente;

    public Cliente(int id, String nome, int idade, String email, boolean ativo, int idContaCorrente) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.ativo = ativo;
        this.idContaCorrente = idContaCorrente;
    }
}
