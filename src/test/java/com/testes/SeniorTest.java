package com.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class SeniorTest {
    Senior senior = new Senior("Daniel Trindade", "13029574656");
    Senior senior2 = new Senior("João Dias", "22446585415");


    @Test
    //Verifica se objeto não está retornando nulo"
    public void test_Junior() {
        assertNotNull(senior);
    }

    @Test
    //Verifica se objeto não é o mesmo
    public void test_Junior2() {
        assertNotSame(senior, senior2);
    }
}
