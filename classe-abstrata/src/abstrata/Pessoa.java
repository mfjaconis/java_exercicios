package abstrata;

public abstract class Pessoa {

    private String nome;

    private String endereco;

    private String telefone;

    // Construtor Pessoa
    public Pessoa(String nome, String endreco, String telefone) {
        this.nome = nome;
        this.endereco = endreco;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método abstrato
    public abstract void exibirInformacoes();
}