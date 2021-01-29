package com.example.testsjunit.service;

import com.example.testsjunit.domain.Cliente;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesServiceTest {

    private GerenciadoraClientesService gerenciadoraClientesService;
    private int idCliente01 = 1;
    private int idCliente02 = 2;
    private List<Cliente> clientesDoBanco = new ArrayList<>();

    @BeforeEach
    public void setUp() {

        Cliente cliente01 = new Cliente(idCliente01,"Diego Mucheniski",34,"diegoemail@teste.com",true,1);
        Cliente cliente02 = new Cliente(idCliente02,"Bruna Mucheniski",30,"brunaemail@teste.com",true,2);

        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        gerenciadoraClientesService = new GerenciadoraClientesService(clientesDoBanco);

//        System.out.println("setUp foi executado");

    }

    @AfterEach
    public void tearDown() {
        gerenciadoraClientesService.limpaListaDeClientes();

//        System.out.println("tearDown foi executado");
    }

    @Test
    public void pesquisaDeClientesTest() {

        Cliente clientePesquisado = gerenciadoraClientesService.pesquisaCliente(idCliente01);

        Assert.assertEquals(clientePesquisado.getId(), idCliente01);
        Assert.assertEquals(clientePesquisado.getEmail(), "diegoemail@teste.com");

    }

    @Test
    public void removeClientesTest() {

        boolean clienteRemovido = gerenciadoraClientesService.removeCliente(idCliente02);

        Assert.assertTrue(clienteRemovido);
        Assert.assertEquals(clientesDoBanco.size(), idCliente01);
        Assert.assertNull(gerenciadoraClientesService.pesquisaCliente(idCliente02));

    }

}
