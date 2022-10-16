package com.testes;
import com.testes.Funcionario;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmpresaTest {

    Empresa empresa = new Empresa();
    Gerente gerente1 = new Gerente("Flavio Augusto", "12345678901234");
    Gerente gerente2 = new Gerente("Pedro Octavio", "12345678905432");
    Diretor diretor1 = new Diretor("Roberto Fernandes", "09876543211234");
    Diretor diretor2 = new Diretor("Arthur Miguel", "12346543211234");
    Junior junior1 = new Junior("Pedro Henrique", "12345678977");
    Senior senior1 = new Senior("João Pedro", "12345678988");
    
    Empresa empresa2 = new Empresa();

    @Test 
    //Verifica se objeto não está retornando nulo
    public void test_Empresa() {
        assertNotNull(empresa);
    }

    @Test 
    //Verifica se objeto não é o mesmo
    public void test_Empresa2() {
        assertNotSame(empresa, empresa2);
    }

    @Test
    public void test_calculaFolhaGerente(){
        gerente1.setSalario_base(3000);
        gerente2.setSalario_base(3000);
        empresa.adicionaFuncionario(0, gerente1);
        empresa.adicionaFuncionario(0, gerente2);
        

    }

}
