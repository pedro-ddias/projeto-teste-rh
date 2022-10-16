package com.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class AnalistaTest {

    Analista analista = new Analista("Pedro Henrique", "13244246525");
    Analista analista2 = new Analista("Octavio Augusto", "22144263578");

    @Test //se objeto não está retornando nulo
    public void test_Analista() {
        assertNotNull(analista);
    }

    @Test //se objeto não é o mesmo
    public void test_Analista2() {
        assertNotSame(analista, analista2);
    }

    @Test //calcular salario final a partir do salário base adicionado e o imposto meramente calculado e testado
    public void test_calculaSalario() {
        // passar o salario do analista
        analista.setSalario(1000);
        assertEquals(925, analista.calculaSalario(), 000);
    }

    @Test //calcular se imposto esta correto de acordo com salario base do
          //analista
    public void test_icalculaImposto() {
        //passar o salario do analista
        analista.setSalario(1000);
        if (analista.getSalario() < 1_045) {
            assertEquals(75.0, analista.icalculaImposto(), 000);
        } else if (analista.getSalario() < 2_089.60) {
            assertEquals(90.0, analista.icalculaImposto(), 000);
        } else if (analista.getSalario() < 3_134.40) {
            assertEquals(120.0, analista.icalculaImposto(), 000);
        } else if (analista.getSalario() < 6_101.06) {
            assertEquals(170.0, analista.icalculaImposto(), 000);
        } else {
            assertEquals(200.0, analista.icalculaImposto(), 000);
        }
    }

    @Test //calcular o decimo terceiro que sera recebido a partir do meses e salario com imposto meramente calculado e testado
    public void test_icalculaDecimoTerceiro() {
        //passar meses trabalhados
        analista.setMesesTrab(15);
        //passar o salário base
        analista.setSalario(1000);
        assertEquals(1156.25, analista.icalculaDecimoTerceiro(), 000);
    }

    @Test //calcular o valor recebido quando tirar ferias a partir do salario com imposto mais 1/3 do salario base
    public void test_icalculaFerias() {
        //passar o salário base
        analista.setSalario(1000);
        assertEquals(1258.3333333333333, analista.icalculaFerias(), 000);
    }
}
