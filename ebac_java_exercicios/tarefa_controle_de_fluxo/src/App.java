import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o valor da terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite o valor da quarta nota: ");
        double nota4 = scanner.nextDouble();

        scanner.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!! =)");
        } else if (media >= 5) {
            System.out.println("Recuperação!! =(");
        } else {
            System.out.println("Reprovado!!");
        }
    }
}
