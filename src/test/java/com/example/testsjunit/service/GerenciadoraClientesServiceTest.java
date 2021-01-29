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

        Cliente cliente01 = new Cliente(1,"Diego Mucheniski",34,"diegoemail@teste.com",true,1);
        Cliente cliente02 = new Cliente(2,"Bruna Mucheniski",30,"brunaemail@teste.com",true,2);

        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientesService gerenciadoraClientesService = new GerenciadoraClientesService(clientesDoBanco);

        Cliente clientePesquisado = gerenciadoraClientesService.pesquisaCliente(1);

        Assert.assertEquals(clientePesquisado.getId(), 1);
        Assert.assertEquals(clientePesquisado.getEmail(), "diegoemail@teste.com");

    }

    @Test
    public void removeClientesTest() {

        List<Cliente> clientesDoBanco = new ArrayList<>();

        Cliente cliente01 = new Cliente(1,"Diego Mucheniski",34,"diegoemail@teste.com",true,1);
        Cliente cliente02 = new Cliente(2,"Bruna Mucheniski",30,"brunaemail@teste.com",true,2);

        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientesService gerenciadoraClientesService = new GerenciadoraClientesService(clientesDoBanco);

        boolean clienteRemovido = gerenciadoraClientesService.removeCliente(2);

        Assert.assertTrue(clienteRemovido);
        Assert.assertEquals(clientesDoBanco.size(), 1);
        Assert.assertNull(gerenciadoraClientesService.pesquisaCliente(2));

    }

}
