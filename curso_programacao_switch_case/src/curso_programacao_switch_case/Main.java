package curso_programacao_switch_case;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número dos dias da semana de 1 a 7: ");
		int day = sc.nextInt();
		String dia;

//CRIANDO UMA ESTRUTURA DE DECISÃO USANDO IF-ELSE:
		// if (day == 1) {
		// dia = "Domingo";
		// } else if (day == 2) {
		// dia = "Segunda";
		// } else if (day == 3) {
		// dia = "Terça";
		// } else if (day == 4) {
		// dia = "Quarta";
		// } else if (day == 5) {
		// dia = "Quinta";
		// } else if (day == 6) {
		// dia = "Sexta";
		// } else if (day == 7) {
		// dia = "Sábado";
		// } else {
		// dia = "Dia inválido. Escolha números de 1 a 7.";
		// }

		// System.out.println(dia);

//CRIANDO UMA ESTRUTURA DE DECISÃO USANDO SWITCH CASE:

		switch (day) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;

		default:
			dia = "Dia inválido. Escolha números de 1 a 7.";
			break;
		}

		System.out.println(dia);

		sc.close();

	}

}
