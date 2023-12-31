package pesquisa_posto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println(
				"Escolha seu tipo de combustível favorito: \n1 - Gasolina  \n2 - Álcool \n3 - Diesel \n4 = FIM \n\n");
		int tipo = sc.nextInt();
		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			} else {
				System.out.println("Você deve escolher uma opção entre 1 e 4.");
			}

			tipo = sc.nextInt();

		}
		System.out.println("MUITO OBRIGADO POR SUA CONTRIBUIÇÃO!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
