package Ex_02;

import Ex_01.DatabaseConnection;

import java.io.*;
import java.util.Scanner;

public class Logger {

    private static Logger instance;
    private String filePath;

    public Logger(String filePath) throws FileNotFoundException{
        this.filePath = filePath;
    }

    public static Logger getInstance(String filePath) throws FileNotFoundException {
        if (instance == null) {
            instance = new Logger(filePath);
        }
        return instance;
    }

    public void log(String logMessage) throws IOException {

        FileWriter fileWriterr = new FileWriter(new File(this.filePath),true);

        fileWriterr.append("\n" + logMessage);

        fileWriterr.flush();
    }

}