package Ex_03;

public class DocText extends Doc{
    public DocText(String autor, String extensao, String nome) {
        super(autor, extensao, nome);
    }


    @Override
    public void open(){
        String texto = "A natureza é um presente incrível que nos cerca todos os dias. As árvores, os rios, os animais e as montanhas formam um cenário de beleza e harmonia. Quando paramos para observar, percebemos como tudo está conectado. O som do vento nas folhas, o canto dos pássaros e o brilho do sol ao nascer são pequenos detalhes que nos lembram da importância de preservar o meio ambiente. Cuidar da natureza é cuidar de nós mesmos, pois dela tiramos o ar que respiramos, a água que bebemos e a paz que sentimos ao estar em contato com ela." ;
        String textoFormatado = texto.replace(". ", ".\n");

        System.out.println("\n Abrindo o documento de " +autor+" "+nome+" "+extensao+".");
        System.out.println("\n Aqui está o texto do documento.");

        System.out.println(textoFormatado);
    }

    public void save(){
        System.out.println("\n Alterações do "+autor+" gravadas.");
    }

    public void close(){
        System.out.println("\n Fechando documento do tipo Text.");

    }
}
