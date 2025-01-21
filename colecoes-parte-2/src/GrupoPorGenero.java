import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList para armazenar os grupos
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        // Variáveis de controle
        String nome;
        String sexo;
        String continuar = null;

        do {
            // Lê o nome
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            // Lê o sexo
            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine().trim().toUpperCase();

            // Valida e adiciona ao grupo correspondente
            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Por favor, digite 'M' ou 'F'.");
                continue;
            }

            // Pergunta se deseja adicionar outra pessoa
            System.out.print("Deseja adicionar outra pessoa? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase();
        } while (continuar.equals("S"));

        // Exibe os grupos
        System.out.println("\nGrupo Masculino:");
        for (String nomeMasculino : masculino) {
            System.out.println("- " + nomeMasculino);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nomeFeminino : feminino) {
            System.out.println("- " + nomeFeminino);
        }

        scanner.close();
    }
}
