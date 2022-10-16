package com.testes;
public class App_RH {
    public static void main(String[] args) throws Exception {

    	Gerente gerente = new Gerente("Pedro", "3380504");
        gerente.setSalario_base(10000);
        gerente.setAdmissao(new Data(17,3,2018));
        System.out.println(gerente.calculaSalario());
        System.out.println();

        Empresa empresa = new Empresa();
        System.out.println(empresa.calculaFolhaTotal());
    }
}

