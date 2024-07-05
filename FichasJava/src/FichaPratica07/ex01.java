package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex01 {
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while ( scannerFicheiro.hasNext()){
            String LinhaAtual = scannerFicheiro.nextLine();
            System.out.println(LinhaAtual);
        }
    }
    public static void main (String[] args) throws FileNotFoundException{
        //imprimirFicheiro("FicheirosFicha07/exercicio_01.txt"*);
        //imprimirFicheiro("FicheirosFicha07/exercicio_01_Alternativa01.txt");
        imprimirFicheiro("FicheirosFicha07/exercicio_01_Alternativa02.txt");
    }
}
