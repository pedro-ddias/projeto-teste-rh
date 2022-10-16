package com.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataTest {
    int dia = 4;
    int mes = 10;
    int anoBi = 2020;

    Data data = new Data();
    Data dataAtual = new Data(dia, mes, anoBi);

    @Test
    public void test_somarDias(){
        Data dataSomada = new Data(9,10,2020);
        Data auxData = this.dataAtual.somarDias(5);
        assertTrue(dataSomada.diasEsseAno(dataSomada) == auxData.diasEsseAno(auxData));
    }

    @Test
    public void test_mes(){
        assertTrue(this.dataAtual.mesesEsseAno(this.dataAtual) == this.mes);
    }

      @Test
    public void test_ano(){
        assertTrue(this.dataAtual.anosEsseAno(this.dataAtual) == this.anoBi);
    }

    @Test
    public void test_dia(){
        assertTrue(this.dataAtual.diasEsseAno(this.dataAtual) == this.dia);
    }

    @Test
    public void test_recente(){
        assertTrue(this.dataAtual.maisRecente(this.data) == 1);
    }

    @Test
    public void test_diferencaMeses(){
        assertTrue(this.data.diferencaMeses(this.dataAtual) == 1449);
    }

}
