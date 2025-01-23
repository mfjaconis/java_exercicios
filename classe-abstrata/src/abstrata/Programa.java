package abstrata;

public class Programa {
    public static void main(String[] args) {

        // Instância de PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica(
                "Matheus",
                "Rua das Flores, 100",
                "(11) 98765-4321",
                "123.456.789-00",
                "15/03/1995");

        // Instância de PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica(
                "Empresa ABC",
                "Av. B, 456",
                "(11) 12345-6789",
                "12.345.678/0001-00",
                "ABC Comércio Ltda.");

        // Exibindo informações das instâncias criadas
        System.out.println("--- Informações de Pessoa Física ---");
        pessoaFisica.exibirInformacoes();

        System.out.println("\n--- Informações de Pessoa Jurídica ---");
        pessoaJuridica.exibirInformacoes();
    }
}
