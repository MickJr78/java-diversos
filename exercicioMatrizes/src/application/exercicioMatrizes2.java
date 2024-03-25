package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exercicioMatrizes2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Indique o número de linhas e colunas da matriz: ");
		int n = sc.nextInt();

		// "MATRIZ DE ORDEM 'N'" REFERE-SE A UMA MATRIZ QUE TEM NÚMERO IGUAL (N) DE
		// LINHAS E COLUNAS.

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int contador = 0;
		int[] negativos = new int[contador];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					contador++;

				}
			}

		}
		System.out.println();
		System.out.print("Números negativos: " + contador);

		System.out.println(Arrays.toString(negativos));

		sc.close();

	}

}
