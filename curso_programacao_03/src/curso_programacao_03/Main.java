package curso_programacao_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("===========================================================================");
		System.out.println("EXERCÍCIO #10 - QUADRANTES DE UM PLANO CARTESIANO");

		Scanner sc = new Scanner(System.in);

		double x, y;

		x = 0;
		y = 0;

		System.out.println("Digite o valor para o ponto X: ");
		x = sc.nextDouble();

		System.out.println("Agora digite o valor para o ponto Y: ");
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Você está no ponto de ORIGEM.");
		} else if (x == 0 && y > 0) {
			System.out.println("Eixo Y");
		} else if (x > 0 && y == 0) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else {
			System.out.println("Quadrante 4");
		}

		sc.close();

	}

}
