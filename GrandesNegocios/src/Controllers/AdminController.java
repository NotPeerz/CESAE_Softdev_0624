package Controllers;

import Model.Sale;
import Repositories.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

//    public double mostSaleValue(){
//        //var mySet = Set.copyOf(Arrays.asList(array)); (para criar a copia de um array em um set).
//        double mostSaleValue = 0;
//        for(Sale msv : salesRepository.getSalesArray()){
//            //se o preço for maior, meu mostSaleValue passa a ter o valor da maior venda. falta implementar
//            if (msv.getPrice()>){
//                mostSaleValue=msv.getPrice();
//            }
//        }
//        return mostSaleValue;
//    }

    public double totalSales(){
        double totalSales=0;

        for(Sale saleAtual : salesRepository.getSalesArray()){
            totalSales+=saleAtual.getQuantity()*saleAtual.getPrice();
        }

        return totalSales;
    }

    public double averageSales() {
        return this.totalSales() / salesRepository.getSalesArray().size();
    }

}
