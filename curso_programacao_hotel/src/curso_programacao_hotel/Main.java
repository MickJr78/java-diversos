package curso_programacao_hotel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner action = new Scanner(System.in);

		int svc;

		System.out.println("Selecione uma ação de 1 a 3: ");
		svc = action.nextInt();

		switch (svc) {
		case 1:
			System.out.println("Fazendo check-in do novo hóspede...");
			break;

		case 2:
			System.out.println("Chamando serviço de quarto...");
			break;

		case 3:
			System.out.println("Fazer um pedido");
			break;

		default:
			System.out.println("Ação inválida. Selecione uma ação de 1 a 3:");
		}

		action.close();

	}

}
