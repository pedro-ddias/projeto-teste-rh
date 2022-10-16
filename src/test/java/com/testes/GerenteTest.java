package com.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;

public class GerenteTest {
    
    Gerente gerente = new Gerente("Pedro Henrique", "185465555502");
    Gerente gerente2 = new Gerente("João Dias", "16455477852");

    @Test 
    //Verifica se objeto não está retornando nulo
    public void test_Gerente() {
        assertNotNull(gerente);
    }

    @Test 
    //Verifica se objeto não é o mesmo
    public void test_Gerente2() {
        assertNotSame(gerente, gerente2);
    }

    @Test 
    //Verifica se o calculo do valor de bonus está correto de acordo com a data de adimissão
    public void test_icalculaBonus() {
        //passar o salario base
        gerente.setSalario_base(3_000);
        //passar data de admissao
        gerente.setAdmissao(new Data(20,7,2020));
        assertEquals(1_200, gerente.icalculaBonus(), 000);
    }

    @Test 
    //Verifica se o calculo do salario está correto a partir do salario base e o bonus recebido de acordo com a data que entrou na empresa
    public void test_calculaSalario() {
        //passar o salario base
        gerente.setSalario_base(3_000);
        //passar data de admissao
        gerente.setAdmissao(new Data(20,7,2020));
        assertEquals(4_200, gerente.calculaSalario(), 000);
    }
}
