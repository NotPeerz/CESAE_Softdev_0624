package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ex03{
    public static void imprimirFicheiro() throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File("FichasJava/FichaPratica07/ex02.txt"));
        PrintWriter printWriter = new PrintWriter(new File("FichasJava/FichaPratica07/ex03.txt"));

        while (scannerFicheiro.hasNext()){
            printWriter.println(scannerFicheiro.nextLine());
        }


        printWriter.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        imprimirFicheiro();
    }
}