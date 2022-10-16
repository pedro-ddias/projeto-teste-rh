package com.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmpresaTest {

    Empresa empresa = new Empresa();
    Empresa empresa2 = new Empresa();

    @Test 
    //Verifica se objeto não está retornando nulo
    public void test_Analista() {
        assertNotNull(empresa);
    }

    @Test 
    //Verifica se objeto não é o mesmo
    public void test_Analista2() {
        assertNotSame(empresa, empresa2);
    }

}
