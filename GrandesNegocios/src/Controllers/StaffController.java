package Controllers;

import Repositories.SalesRepository;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StaffController {

    private SalesRepository salesRepository;

    public StaffController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }



}
