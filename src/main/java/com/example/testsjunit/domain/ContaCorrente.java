package com.example.testsjunit.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContaCorrente {

    private int id;
    private double saldo;
    private boolean ativa;

}
