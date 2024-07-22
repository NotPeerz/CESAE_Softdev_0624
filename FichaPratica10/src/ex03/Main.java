package ex03;

public class Main {
    public static void main(String[] args) {

        Peixe sardinhas = new Peixe ("Sardinha",100,12);
        Peixe peixeEspada = new Peixe("Peixe Espada",150,50);
        Peixe dourada = new Peixe("Dourada",50,20);

        Marisco carangueijo = new Marisco("Carangueijo",100,12);
        Marisco ameijoa = new Marisco("Ameijoa",150,50);
        Marisco lagosta = new Marisco("Lagosta",50,20);

        BarcoPesca bp =new BarcoPesca("Santa Maria do Mar","Branco",);

        bp.addPeixe(sardinhas);
        bp.addPeixe(peixeEspada);
    }
}
