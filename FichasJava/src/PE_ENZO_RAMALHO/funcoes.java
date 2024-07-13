package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoes {
    public static double valorTotalVendido(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        double totalVendido = 0;

        String linha = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNextLine()) {

            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            totalVendido +=Double.parseDouble(linhaDividida[5]);

        }
        return totalVendido;
    }

    public static boolean oiAdmin(String usuario) {


        return usuario.equals("admin");
    }



}
