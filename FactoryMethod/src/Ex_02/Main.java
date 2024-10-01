package Ex_02;

//Trabalhar para implementar um menu onde aparece os tacos com seus respectivos nomes e preços
//Em seguida permitir o utilizador escolher o taco e seguinte realizar os métodos atribuidos.

import java.util.Scanner;

import static Ex_02.TacoFactory.createTaco;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o seu taco (taco de carne de vaca, taco de carne de frango, taco vegetariano):");
        String type = scanner.nextLine();
        Taco taco = createTaco(type);
        taco.Prepare();
        taco.Bake();
        taco.Box();


    }
}
