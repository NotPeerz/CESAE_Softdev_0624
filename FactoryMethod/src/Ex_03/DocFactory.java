package Ex_03;

public class DocFactory {
    public static Doc createDoc (String type) {
        switch(type){
            case "Text" : return new DocText("Enzo","2","Texto simples de Design Patterns");

            case "Calculate" : return new DocCal("Arthur", "3","Calculo de soma");

            case "Presentation" : return new DocApresentation("Marcelo","4","Apresentação de Personalidade");

            default:
                throw new IllegalArgumentException("Tipo de Documento inválido: "+ type);
        }
    }
    }
