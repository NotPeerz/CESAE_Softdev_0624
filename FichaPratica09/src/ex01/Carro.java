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
    public Carro corrida(Carro adversario) {

        if (this.potencia > adversario.potencia) {
            // Ganha o meu carro por potencia
            return this;
        } else {

            if (this.potencia < adversario.potencia) {
                // Ganha o adversario por potencia
                return adversario;
            } else {
                // Empate de potencia

                if (this.cilindrada > adversario.cilindrada) {
                    // Ganha o meu carro por cc
                    return this;
                } else {

                    if (this.cilindrada < adversario.cilindrada) {
                        // Ganha o adversario por cc
                        return adversario;
                    } else {
                        //Empate de cc

                        if (this.anoFabrica > adversario.anoFabrica) {
                            // Ganha o meu carro por ser mais recente
                            return this;
                        } else {

                            if (this.anoFabrica < adversario.anoFabrica) {
                                // Ganha o adversario por ser mais recente
                                return adversario;
                            } else {
                                // Empate total
                                return null;
                            }
                        }
                    }
                }

            }

        }

    }

    public void exibirDetalhes() {
        System.out.println("***** " + this.marca + " " + this.modelo + " *****");
        System.out.println("Potência: " + this.potencia + " cv.");
        System.out.println("Cilindrada: " + this.cilindrada + " cc");
        System.out.println("Ano Fabrico: " + this.anoFabrica);
        System.out.println("Tipo Combustivel: " + this.combustivel);
        System.out.println("Consumo: " + this.litros100km + " L/100Km.");
        System.out.println("****************************");
    }
}