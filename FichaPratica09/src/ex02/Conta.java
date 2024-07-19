package ex02;

public class Conta {
    private String numConta;
    private String titular;
    private double saldo;
    private int anoAbertura;
    private double margemEmprestimo;
    private double valorDivida;

    public Conta(String numConta, String titular, double saldo, int anoAbertura, double margemEmprestimo, double valorDivida) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
        this.anoAbertura = anoAbertura;
        this.margemEmprestimo = margemEmprestimo;
        this.valorDivida = valorDivida;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void levantar(double valorLevantamento) {

        if (this.saldo >= valorLevantamento) {
            this.saldo -= valorLevantamento;
        }

    }
    public void transferir(double valorTransferencia, Conta contaDestino) {

        if (this.saldo >= valorTransferencia) {
            this.saldo -= valorTransferencia;
            contaDestino.saldo += valorTransferencia;
        }

    }
    public boolean emprestimo( double valorEmprestimo) {
        if (this.valorDivida==0 && this.getMargemEmprestimo() > valorEmprestimo) {
            return=true;
        }
            return=false;
    }


    public void exibirDetalhes() {
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Núm. Conta: " + this.numConta + " | Titular: " + this.titular + " | Saldo: " + this.saldo);
    }
}
