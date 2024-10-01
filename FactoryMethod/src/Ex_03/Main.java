package Ex_03;

import java.util.Scanner;
import static Ex_03.DocFactory.createDoc;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo do documento (Text, Calculate, Presentation):");
        String type = scanner.nextLine();

        Doc doc = createDoc(type);

        String acao;
        do {
            System.out.println("Escolha a ação para o documento (open, save, close):");

            acao = scanner.nextLine();

            switch (acao) {
                case "open":
                    doc.open();
                    break;
                case "save":
                    doc.save();
                    break;
                case "close":
                    doc.close();
                default:
            }

        } while (!acao.equals("close"));

    }
}