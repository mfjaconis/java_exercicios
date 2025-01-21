
import java.util.*;

public class OrdenarENomearPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os nomes e seus respectivos sexos
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        Map<String, String> nomeSexoMap = new HashMap<>();

        // Variáveis de controle
        String nome;
        String sexo;
        String continuar = null;

        do {
            // Lê o nome
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine().trim();

            // Lê o sexo
            System.out.print("Digite o sexo (M/F):  ");
            sexo = scanner.nextLine().trim().toUpperCase();

            // Valida e adiciona ao grupo correspondente
            if (sexo.equals("M")) {
                masculino.add(nome);
                nomeSexoMap.put(nome, "M");
            } else if (sexo.equals("F")) {
                feminino.add(nome);
                nomeSexoMap.put(nome, "F");
            } else {
                System.out.println("Sexo inválido! Por favor, digite 'M' ou 'F'.");
                continue;
            }

            // Pergunta se deseja adicionar outra pessoa
            System.out.print("Deseja adicionar outra pessoa? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase();
        } while (continuar.equals("S"));

        // Ordena os nomes alfabeticamente
        List<String> todosNomes = new ArrayList<>(nomeSexoMap.keySet());
        Collections.sort(todosNomes);

        // Exibe os nomes em ordem alfabética, separados por vírgula
        System.out.println("\nNomes em ordem alfabética:");
        System.out.println(String.join(", ", todosNomes));

        // Exibe os nomes e seus respectivos sexos
        System.out.println("\nNomes e seus sexos:");
        for (String nomeOrdenado : todosNomes) {
            System.out.println(nomeOrdenado + " - " + nomeSexoMap.get(nomeOrdenado));
        }

        scanner.close();
    }
}
