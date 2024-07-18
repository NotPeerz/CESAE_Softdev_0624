package ex10;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario = 0;
    private int dep;

    public Funcionario(String nome, double salario, int dep) {
        this.nome = nome;
        this.salario = salario;
        this.dep = dep;
    }

    public void aumentarSalario(double aumento) {
        this.salario+=this.salario + aumento/100;
    }

    public void exibirDados() {
        System.out.println("Nome do funcionário: "+nome+ " |Salário: "+salario+" |Departamento: "+dep);
    }
}