package Ex_03;

public class DocCal extends Doc{
    public DocCal(String autor, String extensao, String nome) {
        super(autor, extensao, nome);
    }
    @Override
    public void open(){
        System.out.println("\n Abrindo o documento de " +autor+" "+nome+" "+extensao+".");
        int soma = 1+1;
        System.out.println("\n O calculo da soma é: "+soma+".");
    }

    public void save(){
        System.out.println("\n Alterações do "+autor+" gravadas.");
    }

    public void close(){
        System.out.println("\n Fechando documento do tipo Calculate.");
    }

}
