package abstrata;

public class PessoaFisica extends Pessoa {

    private String cpf;

    private String dataDeNascimento;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String dataDeNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void exibirInformacoes() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }
}