package ex06;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta [] listaParticipantes;


    public Competicao(String nome, String pais, int maxInscritos) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[maxInscritos];
    }

    public void addAtleta(Atleta atletaNovo){
        for (int i=0; i< this.listaParticipantes.length;i++) {
            if (this.listaParticipantes[i]==null) {
                this.listaParticipantes[i]=atletaNovo;
                return;
            }
        }
    }



}
