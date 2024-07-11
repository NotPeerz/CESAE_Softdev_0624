package PE_ENZO_RAMALHO;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class exemploDeFuncao {

    //Cria a função com um tipo nesse caso foi o "String" e em seguida de o nome da função nesse caso "funcaoVitor".
    public static String funcaoVitor() {

        //o return vai ser para retornar a variavel.
        return "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }
//Apos o return fecha a função e cria invoque ela assim que for necessario.
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(funcaoVitor());
    }
}
