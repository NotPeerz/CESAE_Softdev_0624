package ex01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrica;
    private int litros100km;
    private int idade;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel combustivel;
//sempre que tiver uma enumeração criar uma private atribuindo uma variavel para a enumeração e depois adicionar no construtor.
    public Carro(String marca, String modelo, int anoFabrica, int litros100km, int idade, int potencia,double cilindrada, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrica = anoFabrica;
        this.litros100km = litros100km;
        this.idade = idade;
        this.potencia = potencia;
        this.cilindrada=cilindrada;
        this.combustivel = combustivel;
    }

    public void ligar() {
        if (idade>30 && this.combustivel.equals(TipoCombustivel.DIESEL)) {
            System.out.println("Deita um pouco de fumo...Custa a pegar...O carro está ligado!"+"Vrum-vrum-vrum");
        }
        if (idade>30 && this.combustivel.equals(TipoCombustivel.GASOLINA) || this.combustivel.equals(TipoCombustivel.GPL)) {
            System.out.println("Custa a pegar...O carro está ligado!"+"Vrum-vrum-vrum");
        }
        if (idade<=30 && this.potencia<250) {
            System.out.println("O carro está ligado!"+"Vruummmmmmmmmmm");
        }
        if (idade<=30 && this.potencia>=250) {
            System.out.println("O carro está ligado! "+"v-12 starting up! "+"VRUUMMMMMMMM PA PA PA");
        }

    }
    public Carro corrida(Carro adversario){
        if (adversario.potencia > this.potencia) {
            // Ganha o adversario
            return adversario;
        }else{
            if (adversario.potencia < this.potencia) {
                return this;
            }else{
                if (adversario.potencia == this.potencia) {
                    //vai pro desempate na cilindrada

                    if (adversario.cilindrada > this.cilindrada) {
                        return adversario;
                    }else{
                        return this;
                    }
                    if (adversario.cilindrada==this.cilindrada) {
                        if (adversario.idade < this.idade) {
                            return adversario;
                        }else{
                            return this;
                        }
                    }
                    if (adversario.idade == this.idade) {
                        System.out.println("Houve um empate!");
                        return null;
                    }
                }
                return Carro;
            }
        }
}
