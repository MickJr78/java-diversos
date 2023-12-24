package curso_programacao_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// System.out.println("EXERCÍCIO #01 - NEGATIVO OU POSITIVO");

		// int num;

		// System.out.println("Digite um número e pressione ENTER:");
		// num = sc.nextInt();
		// if (num < 0) {
		// System.out.printf("O número %d é NEGATIVO.", num);
		// }else {
		// System.out.printf("O número %d é POSITIVO.", num);
		// }

		// System.out.println("============================================================");
		// System.out.println("EXERCÍCIO #02 - PAR OU ÍMPAR");

		// int x;

		// System.out.println("Digite um número, negativo ou positivo:");
		// x = sc.nextInt();

		// if (x%2 == 0) {
		// System.out.println("O número é PAR");

		// }else {
		// System.out.println("O número é ÍMPAR");
		// }

		System.out.println("EXERCÍCIO #02 - ENCONTRANDO MÚLTIPLOS");
		
		int A,B;
		
		System.out.println("Digite dois números e verifique se eles são múltiplos: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MÚLTIPLOS.");
		}else {
			System.out.println("NÃO SÃO MÚLTIPLOS.");
		}		
		
		
		
		sc.close();
	}

}
