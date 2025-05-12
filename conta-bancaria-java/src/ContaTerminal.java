import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual o seu saldo atual?");
        double saldo = scanner.nextDouble();
        
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo R$ " + saldo + " já está disponível para saque");
    }

    }
}
