public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public abstract String informacoesVeiculo();

    public int getAno() {
        return ano; 
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}