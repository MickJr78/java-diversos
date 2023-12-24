package curso_programacao_telefonia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de minutos consumidos: ");
		int minutos = sc.nextInt();

		double conta = 50.0;

		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;

		}

		System.out.printf("Valor a pagar: R$ %.2f \n", conta);

		sc.close();

	}

}
