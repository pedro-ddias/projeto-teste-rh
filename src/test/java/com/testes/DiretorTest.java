package com.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class DiretorTest {
    
    Diretor diretor = new Diretor("Daniel Trindade", "52044686515");
    Diretor diretor2 = new Diretor("Maycon Felipe", "42574856620");

    @Test //se objeto não está retornando nulo
    public void test_Diretor() {
        assertNotNull(diretor);
    }

    @Test //se objeto não é o mesmo
    public void test_Diretor2() {
        assertNotSame(diretor, diretor2);
    }

    @Test //calcular o valor dee bonus que vai receber de acordo com a data de adimissão
    public void test_icalculaBonus() {
        //passar o salario base
        diretor.setSalario_base(10_000);
        //passar data de admissao
        diretor.setAdmissao(new Data(17,3,2018));
        assertEquals(4_000, diretor.icalculaBonus(), 000);
    }

    @Test //calcular salario a partir do salario base e o bonus recebido de acordo com a data que entrou na empresa
    public void test_calculaSalario() {
        //passar o salario base
        diretor.setSalario_base(10_000);
        //passar data de admissao
        diretor.setAdmissao(new Data(17,3,2018));
        assertEquals(14_000, diretor.calculaSalario(), 000);
    }


}
