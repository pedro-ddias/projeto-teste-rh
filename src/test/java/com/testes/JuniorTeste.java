package com.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JuniorTeste {
    Junior junior = new Junior("Daniel Trindade", "13029574656");
    Junior junior2 = new Junior("João Dias", "22446585415");


    @Test
    //Verifica se objeto não está retornando nulo"
    public void test_Junior() {
        assertNotNull(junior);
    }

    @Test
    //Verifica se objeto não é o mesmo
    public void test_Junior2() {
        assertNotSame(junior, junior2);
    }


}
