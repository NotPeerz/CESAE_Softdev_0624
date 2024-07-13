package PE_ENZO_RAMALHO;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o usuario: ");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        if (oiAdmin(usuario)) {
            if (senha.equals("admin123")) {
                System.out.println("Seja bem-vindo Admin!");
            } else {
                System.out.println("Senha invalida!");
            }

        } else {

            System.out.println("Seja bem-vindo Cliente!");
        }

        scanner.close();
    }

    public static boolean oiAdmin(String usuario) {


        return usuario.equals("admin");
    }
}