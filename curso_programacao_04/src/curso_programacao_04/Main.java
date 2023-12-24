package curso_programacao_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================================================");
		System.out.println("EXERCÍCIO #11 - CÁLCULO DE IMPOSTO DE RENDA");

		double renda, imposto;

		System.out.println("Digite o valor da renda para obter o valor do imposto a ser pago: ");
		renda = sc.nextDouble();

		if (renda == 0.00 || renda <= 2000.00) {
			System.out.println("Isento");
		} else if (renda == 2000.01 || renda <= 3000.00) {
			imposto = (renda - 2000) * 0.08;
			System.out.printf("O valor do imposto é de %.2f \n", imposto);
		} else if (renda == 3000.01 || renda <= 4500.00) {
			imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("O valor do imposto é de %.2f \n", imposto);
		} else if (renda >= 4500.01) {
			imposto = (renda - 4500)* 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("Hey, milionário! O valor do seu imposte é de %.2f \n", imposto);
		}

		sc.close();
	}

}
