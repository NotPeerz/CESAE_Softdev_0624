package Ex_03;

public class DocApresentation extends Doc{
    public DocApresentation(String autor, String extensao, String nome) {
        super(autor, extensao, nome);
    }

    @Override
    public void open(){
        String texto = "Marcelo é uma pessoa dinâmica, determinada e sempre em busca de novos desafios. Sua principal característica é a dedicação em tudo o que faz, seja no ambiente profissional ou pessoal. Com uma visão criativa e estratégica, ele consegue transformar ideias em resultados práticos e inovadores.";
        String textoFormatado = texto.replace(". ", ".\n");
        System.out.println("\n Abrindo o documento de " +autor+" "+nome+" "+extensao+".");
        System.out.println(textoFormatado);
        }

    public void save(){
        System.out.println("\n Alterações do "+autor+" gravadas.");
    }

    public void close(){
        System.out.println("\n Fechando documento do tipo Presentation.");
    }

}
