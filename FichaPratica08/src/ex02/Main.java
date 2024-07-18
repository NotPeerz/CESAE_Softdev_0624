package ex02;

public class Main {
    public static void main (String[] args) {
Cao rex = new Cao("Rex","Rafeiro");
Cao max = new Cao("Max","PASTOR_ALEMAO");

rex.ladrar();
max.ladrar();

        System.out.println("-------------------------");
        rex.setLatido("RRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        rex.ladrar();
        max.ladrar();
    }
}
