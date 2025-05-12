package celular;

import aplicativos.superapp.SuperApp;

public class Iphone {
    public static void main(String[] args) {

        SuperApp superApp = new SuperApp();

        // reprodutor musical
        superApp.tocar();
        superApp.pausar();
        superApp.selecionarMusica("Isis - Mc Kako");

        // aparelho telefônico
        superApp.ligar("123456789");
        superApp.atender();
        superApp.iniciarCorreioVoz();

        // navegador de internet
        superApp.exibirPagina("https://www.example.com");
        superApp.adicionarNovaAba();
        superApp.atualizarPagina();
    }
}
