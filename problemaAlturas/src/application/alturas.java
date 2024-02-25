package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class alturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		System.out.println();
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");

			System.out.print("Nome: ");
			String nome = sc.next();
			nomes[i] = nome;
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			idades[i] = idade;
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			alturas[i] = altura;
			System.out.println();
		}

		double soma = 0.0;
		double media = 0.0;

		for (int i = 0; i < n; i++) {
			soma += alturas[i];
			media = soma / n;
		}

		DecimalFormat dec = new DecimalFormat("###,###.##");
		System.out.print("Altura média: " + dec.format(media));
		System.out.println();

		int menores = 0;
		double percent = 0.0;

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				menores++;
				percent = menores * 100 / n;
			}
		}
		System.out.println("Pessoas com menos de 16 anos: " + percent + "%");


		for (int i = 0; i < alturas.length; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
			

		}

		sc.close();

	}

}
