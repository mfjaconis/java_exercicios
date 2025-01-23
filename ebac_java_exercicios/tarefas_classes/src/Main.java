public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Jetta", "Branco", 2018);

        meuCarro.exibirInfo();

        meuCarro.ligar();

        meuCarro.acelerar(30);

        meuCarro.frear(10);
        meuCarro.frear(10);
        meuCarro.frear(10);

        meuCarro.desligar();
    }
}
