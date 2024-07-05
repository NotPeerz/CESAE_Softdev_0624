package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
    public static void imprimirFicheiro() throws FileNotFoundException {

    Scanner scannerFicheiro = new Scanner(new File("FichasJava/FichaPratica07/exercicio_04.csv"));

    while (scannerFicheiro.hasNext()) {
        System.out.println(scannerFicheiro.next());
    }
        
        }

    }

}
