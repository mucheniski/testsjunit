package com.example.testsjunit.service;

import com.example.testsjunit.domain.Cliente;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesServiceTest {

    @Test
    public void pesquisaDeClientesTest() {

        List<Cliente> clientesDoBanco = new ArrayList<>();

        Cliente cliente01 = Cliente.builder()
                .id(1)
                .nome("Gustavo Farias")
                .idade(31)
                .email("gugafarias@gmail.com")
                .ativo(true)
                .idContaCorrente(1)
                .build();

        Cliente cliente02 = Cliente.builder()
                .id(2)
                .nome("Felipe Augusto")
                .idade(34)
                .email("felipeaugusto@gmail.com")
                .ativo(true)
                .idContaCorrente(2)
                .build();

        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientesService gerenciadoraClientesService = new GerenciadoraClientesService(clientesDoBanco);

        Cliente clientePesquisado = gerenciadoraClientesService.pesquisaCliente(1);

        Assert.assertEquals(clientePesquisado.getId(), 1);
        Assert.assertEquals(clientePesquisado.getEmail(), "gugafarias@gmail.com");

    }

}
