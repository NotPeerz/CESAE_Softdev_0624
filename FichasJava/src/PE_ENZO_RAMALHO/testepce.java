package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testepce {
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

    Scanner scannerFicheiro = new Scanner(new File(path));
for ()
    while ( scannerFicheiro.hasNext()){
        String LinhaAtual = scannerFicheiro.nextLine();
        System.out.println(LinhaAtual);
    }
}
}
