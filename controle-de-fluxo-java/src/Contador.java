import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		int parametroUm = 0;
		int parametroDois = 0;

		try {
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = terminal.nextInt();

			System.out.println("Digite o segundo parâmetro");
			parametroDois = terminal.nextInt();

			System.out.println("Segue a contagem do primeiro parâmetro, até o segundo parâmetro");

			contar(parametroUm, parametroDois);

		} catch (InputMismatchException e) {
			System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo valor deve ser maior que o segundo");
		}

		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm >= parametroDois) {

			throw new ParametrosInvalidosException();
		}

		for (int valor = parametroUm; valor < parametroDois; valor++) {
			System.out.println(valor);
		}
	}
}