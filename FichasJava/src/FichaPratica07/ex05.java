package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
    public static int somarNumeroFicheiro(String path) throws FileNotFoundException {

    Scanner scannerFicheiro = new Scanner(new File("FichasJava/FichaPratica07/exercicio_04.csv"));

    int soma=0;

    while (scannerFicheiro.hasNext()) {
        soma+=scannerFicheiro.nextInt();
    }

    return soma;
        }
        public static void main(String[] args) throws FileNotFoundException{
            System.out.println("Soma do Ficheiro" + somarNumeroFicheiro("FichasJava/FichaPratica07/exercicio_05_31.txt"));
        }


    }


