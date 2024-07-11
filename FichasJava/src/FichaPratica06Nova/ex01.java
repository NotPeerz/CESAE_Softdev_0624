package FichaPratica06Nova;

import java.util.Scanner;

public class ex01 {
    public static void barulhoAnimal(String animal) {

        switch (animal) {

            case "cao" :

                System.out.println("AU AU AU");
                break;

            case "gato" :

                System.out.println("MIAU MIAU");
                break;

            case "peixe" :

                System.out.println("GLUB GLUB");
                break;

            case "vaca" :

                System.out.println("MUUUUUUUUUUU");
                break;

            case "porco" :

                System.out.println("OINC OINC");
                break;
            default:
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalSelecionado;

        while (true) {
            System.out.println("Seleciona um animal: ");
            animalSelecionado = input.next();
            barulhoAnimal(animalSelecionado);
        }
    }
}