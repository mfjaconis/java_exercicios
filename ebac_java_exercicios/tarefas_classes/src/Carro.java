// Classe que representa um Carro
public class Carro {
    // Atributos (propriedades) do Carro
    private String modelo;          // Modelo do carro (ex.: Jetta)
    private String cor;             // Cor do carro (ex.: Branco)
    private int ano;                // Ano de fabricação do carro
    private double velocidadeAtual; // Velocidade atual do carro
    private boolean ligado;         // Estado do carro (ligado ou desligado)

    // Construtor da classe Carro
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;                // Inicializa o modelo do carro
        this.cor = cor;                      // Inicializa a cor do carro
        this.ano = ano;                      // Inicializa o ano do carro
        this.velocidadeAtual = 0;            // Inicializa a velocidade como 0
        this.ligado = false;                 // Inicialmente o carro está desligado
    }

    // Método para ligar o carro
    public boolean ligar() {
        // Verifica se o carro está desligado
        if (!ligado) {
            ligado = true;                  // Liga o carro
            System.out.println("Carro ligado");
        } else {
            System.out.println("O carro já está ligado"); // Se já estiver ligado
        }
        return ligado;                       // Retorna o estado do carro
    }

    // Método para desligar o carro
    public void desligar() {
        // Verifica se o carro está ligado e se está parado (velocidade 0)
        if (ligado && velocidadeAtual == 0) {
            ligado = false;                 // Desliga o carro
            System.out.println("Carro desligado");
        } else if (velocidadeAtual > 0) {
            System.out.println("O carro está em movimento"); // Carro em movimento não pode ser desligado
        } else {
            System.out.println("O carro já está desligado"); // Já desligado
        }
    }

    // Método para acelerar o carro
    public void acelerar(double incremento) {
        // Verifica se o carro está ligado antes de acelerar
        if (ligado) {
            velocidadeAtual += incremento;    // Aumenta a velocidade
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("O carro está desligado, precisa ligar antes de acelerar.");
        }
    }

    // Método para frear o carro
    public void frear(double decremento) {
        // Diminui a velocidade do carro
        velocidadeAtual -= decremento;

        // Verifica se a velocidade não ficou negativa
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;             // Define a velocidade como 0 se for menor que 0
        }
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);             // Exibe o modelo
        System.out.println("Cor: " + cor);                   // Exibe a cor
        System.out.println("Ano: " + ano);                   // Exibe o ano de fabricação
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h"); // Exibe a velocidade atual
    }

    // Método para obter a velocidade atual
    public double getVelocidadeAtual() {
        return velocidadeAtual;  // Retorna a velocidade atual do carro
    }

    // Método para verificar se o carro está em movimento (velocidade > 0)
    public boolean estaEmMovimento() {
        return velocidadeAtual > 0;  // Retorna verdadeiro se o carro estiver em movimento
    }

    // Método para verificar se o carro está ligado
    public boolean estaLigado() {
        return ligado;  // Retorna verdadeiro se o carro estiver ligado
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void seAno(int ano) {
        this.ano = ano;
    }
}
