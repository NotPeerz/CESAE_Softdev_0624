package ex02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Enzo", 18, "999999999", "enzo@gmail.com");
        Pessoa pessoa2 = new Pessoa("Nenzo", 32, "999999998", "nenzo@gmail.com");
        Pessoa pessoa3 = new Pessoa("Vichenzo", 84, "999999997", "vichenzo@gmail.com");
        Pessoa pessoa4 = new Pessoa("Renzo", 40, "999999996", "renzo@gmail.com");
        Pessoa pessoa5 = new Pessoa("Lorenzo", 61, "999999995", "lorenzo@gmail.com");

        Sorteio cabazNatal =new Sorteio(5000);

        cabazNatal.addParticipante(pessoa1);
        cabazNatal.addParticipante(pessoa2);
        cabazNatal.addParticipante(pessoa3);
        cabazNatal.addParticipante(pessoa4);
        cabazNatal.addParticipante(pessoa5);

        System.out.println();

        cabazNatal.exibirDetalhes();

        //cabazNatal.exibirDetalhesForEach();

        System.out.println("\n********** Vencedor **********");
        cabazNatal.sortear().exibirDetalhes();

    }
}
