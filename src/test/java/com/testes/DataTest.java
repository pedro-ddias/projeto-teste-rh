package com.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataTest {
    int dia = 4;
    int mes = 10;
    int anoBi = 2020;

    Data data = new Data();
    Data dataAtual = new Data(dia, mes, anoBi);

    @Test
    //Verifica se objeto não está retornando nulo"
    public void test_Data() {
        assertNotNull(data);
    }

    @Test
    //Verifica se objeto não é o mesmo
    public void test_Data2() {
        assertNotSame(data, dataAtual);
    }

    @Test
    // Verifica se a soma de dias está correta, comparando com uma data, de acordo com uma data passada e solicita a somar dias
    public void test_somarDias(){
        Data dataSomada = new Data(9,10,2020);
        Data auxData = this.dataAtual.somarDias(5);
        assertTrue(dataSomada.diasEsseAno(dataSomada) == auxData.diasEsseAno(auxData));
    }

    @Test
    // Verifica se o método esta retornando o mes correto
    public void test_mes(){
        assertTrue(this.dataAtual.mesesEsseAno(this.dataAtual) == this.mes);
    }

      @Test
      // Verifica se o método está retornando o ano correto
    public void test_ano(){
        assertTrue(this.dataAtual.anosEsseAno(this.dataAtual) == this.anoBi);
    }

    @Test
    // Verifica se o método está retornando o dia correto
    public void test_dia(){
        assertTrue(this.dataAtual.diasEsseAno(this.dataAtual) == this.dia);
    }

    @Test
    // Vericia se a data é mais recente, caso for retorna 1
    public void test_maisRecente(){
        assertTrue(this.dataAtual.maisRecente(this.data) == 1);
    }

    @Test
    // Verifica se o método diferença de mês retorna a quantidade correta em relação a data já predefinida no sistema
    public void test_diferencaMeses(){
        assertTrue(this.data.diferencaMeses(this.dataAtual) == 1449);
    }




}
