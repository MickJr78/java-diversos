package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		System.out.println();
		int soma = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();

			soma += numbers[i];

		}
		System.out.println();
		System.out.println("Números digitados: " + Arrays.toString(numbers));
		System.out.println("Números somados: " + soma);

		System.out.print("Números pares: ");

		int qtdPares = 0;

		int[] pares = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(" " + numbers[i]);
				qtdPares++;
			}

		}
		System.out.println();
		System.out.println("Quantidade de números pares: " + qtdPares);

		sc.close();

	}

}
