package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicioMatrix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Iniciando a Matriz...");
		System.out.print("Quantas linhas deseja inserir na Matriz? ");
		int m = sc.nextInt();
		System.out.print("OK. E quantas colunas deseja inserir? ");
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();

			}
		}

		System.out.print("Informe um número para procurar na tabela: ");
		int x = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				/*
				 * if (matrix[i][j] != x) {
				 * System.out.println("Este número não está relacionado na tabela."); }
				 */
				if (matrix[i][j] == x) {
					System.out.println("----------------------------------------------");
					System.out.print("Posição:");
					System.out.println("Linha " + i + ", Coluna " + j);
					System.out.println();

					if (j > 0) {
						System.out.println("Esquerda: " + matrix[i][j - 1]);
					} else {
						System.out.println("Não há números à esquerda.");
					}

					if (i > 0) {
						System.out.println("Acima: " + matrix[i - 1][j]);
					} else {
						System.out.println("Não há números acima.");
					}
					if (j < matrix[i].length - 1) {
						System.out.println("Direita: " + matrix[i][j + 1]);
					} else {
						System.out.println("Não há números à direita.");
					}
					if (i < matrix.length - 1) {
						System.out.println("Abaixo: " + matrix[i + 1][j]);
					} else {
						System.out.println("Não há números abaixo.");
					}
					System.out.println();
					System.out.println("----------------------------------------------");
				}

			}
		}

		sc.close();

	}

}
