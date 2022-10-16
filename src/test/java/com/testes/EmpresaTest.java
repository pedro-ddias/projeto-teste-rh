package com.testes;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmpresaTest {

    Empresa empresa = new Empresa();
    Data data = new Data();
    Data dataHoje = new Data(data.retornaDiaAtual(), data.retornaMesAtual(), data.retornaAnoAtual());
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
    // Verifica se o calculo do salário de todos gerente está correto, de acordo com os gerentes adicionados a sua respectiva lista e passado ao método
    public void test_calculaFolhaGerenteEDiretor(){
        this.gerente1.setSalario_base(3000);
        this.gerente1.setAdmissao(this.dataHoje);
        this.gerente2.setSalario_base(3000);
        this.gerente2.setAdmissao(this.dataHoje);
        this.empresa.adicionaFuncionario(0, gerente1);
        this.empresa.adicionaFuncionario(0, gerente2);
        assertTrue(this.empresa.calculaFolhaGerente() == 6000);
    }

    @Test
    // Verifica se o calculo do salário de todos analista está correto, de acordo com os analistas adicionados a sua respectiva lista e passado ao método
    public void test_calculaFolhaAnalista(){
        this.junior1.setSalario(1_040); // salario real deve ser R$962,00
        this.junior1.setMesesTrab(1);
        this.senior1.setSalario(3_134); // salario real deve ser R$2,757.92
        this.senior1.setMesesTrab(1);
        this.empresa.adicionaFuncionario(2, junior1);
        this.empresa.adicionaFuncionario(2, senior1);
        assertTrue(this.empresa.calculaFolhaAnalista() == 3_719.92);

    }
}
