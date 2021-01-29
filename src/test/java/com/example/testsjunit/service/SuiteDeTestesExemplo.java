package com.example.testsjunit.service;

/*
    A Suite de testes é usada para que possa ser testada uma ou mais classes de testes ao mesmo tempo
    na anotação @SuiteClasses({Classe1.class, Classe2.class, ...})

    Após preenchidas todas as anotações, basta executar a classe abaixo como Junit
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GerenciadoraClientesServiceTest.class})
public class SuiteDeTestesExemplo {

}
