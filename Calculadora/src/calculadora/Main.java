package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entries = new Scanner(System.in);

		int A, B, result;
		String operator;

		System.out.println("Digite o valor de A: ");
		A = entries.nextInt();
		System.out.println("Digite o valor de B: ");
		B = entries.nextInt();

		System.out.println("Qual operação deseja realizar? \n + : SOMA \n - : SUBTRAÇÃO \n * : MULTIPLICAÇÃO \n / : DIVISÃO \n");
		operator = entries.next();
		
		switch(operator) {
		case "+":
			result = A + B;
			System.out.printf("O resultado de %d %s %d é igual a %d.", A, operator, B, result);
			break;
			
		case "-":
			result = A - B;
			System.out.printf("O resultado de %d %s %d é igual a %d.", A, operator, B, result);
			break;
		case "*":
			result = A * B;
			System.out.printf("O resultado de %d %s %d é igual a %d.", A, operator, B, result);
			break;
		case "/":
			result = A / B;
			System.out.printf("O resultado de %d %s %d é igual a %d.", A, operator, B, result);
			break;
		}
		
		

		entries.close();
	}

}
