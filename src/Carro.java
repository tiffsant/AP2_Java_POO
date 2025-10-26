public class Carro extends Veiculo {

    public int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public String informacoesVeiculo() {
        return "---Dados do Carro---" +
        "\nMarca: " + marca +
        "\nModelo: " + modelo +
        "\nAno: " + getAno() +
        "\nNúmeros de portas: " + numeroPortas +
        "\n------------------------------------";
    }
}
