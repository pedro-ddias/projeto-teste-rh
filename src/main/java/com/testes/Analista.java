package com.testes;

public class Analista extends Funcionario implements I_CLT {

    private double salario;
    private int mesesTrab;

    public Analista(String nomeFuncionario, String cpfFuncionario) {
        super(nomeFuncionario);
    }

    @Override
    double calculaSalario() {
        return icalculaSalario();
    }

    @Override
    public double icalculaSalario() { 
        return this.salario - icalculaImposto();
    }

    @Override
    public double icalculaImposto() {
        if (this.salario < 1_045) {
            return this.salario * 0.075;
        } else if (this.salario < 2_089.60) {
            return this.salario * 0.09;
        } else if (this.salario < 3_134.40) {
            return this.salario * 0.12;
        } else if (this.salario < 6_101.06) {
            return this.salario * 0.17;
        } else {
            return this.salario * 0.20;
        }
    }

    @Override
    public double icalculaDecimoTerceiro() {
        return (icalculaSalario() / 12) * this.mesesTrab;
    }

    @Override
    public double icalculaFerias() {
        return icalculaSalario() + this.salario / 3;
    }


    // Get e Set
    public int getMesesTrab() {
        return mesesTrab;
    }

    public void setMesesTrab(int mesesTrab) {
        this.mesesTrab = mesesTrab;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

}
