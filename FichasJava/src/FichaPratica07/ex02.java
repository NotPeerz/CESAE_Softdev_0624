package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex02 {
public static void usingPrintWriter() throws FileNotFoundException {

    String fileContent = "Hello! Adoro Programar em Java";

    //pathname depois do file é para por o caminho da pasta "path" e um nome pra pasta"name", como exemplo "FichasJava/FichaPratica07/exemplo.txt" "path:FichasJava/FichaPratica07" "name:/exemplo.txt".

    File file = new File("FichasJava/FichaPratica07/ex02.txt");
    PrintWriter printWriter =new PrintWriter(file);

    printWriter.println(fileContent);
    printWriter.println("É a minha UFCD Favorita");

    printWriter.close();
}

    public static void main(String[] args) throws FileNotFoundException {
        usingPrintWriter();
    }
}
