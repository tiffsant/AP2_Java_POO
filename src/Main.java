public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("BYD", " Dolphin Mini", 2024, 4);
        meuCarro.setAno(2025);
        System.out.println(meuCarro.informacoesVeiculo());

        Moto minhaMoto = new Moto("Honda", "CG 160", 2024, 160);
        minhaMoto.setCilindrada(162);
        System.out.println(minhaMoto.informacoesVeiculo());
    }
}