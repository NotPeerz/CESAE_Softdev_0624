package ex10;

import ex10.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1=new Funcionario("Enzo",1000,20);
        funcionario1.exibirDados();
        funcionario1.aumentarSalario(10);
        funcionario1.exibirDados();


    }

}