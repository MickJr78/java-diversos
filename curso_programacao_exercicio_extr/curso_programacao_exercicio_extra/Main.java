package curso_programacao_exercicio_extra;

import java.util.Locale;
import java.util.Scanner;


//CRÉDITOS DO ENUNCIADO DO EXERCÍCIO - WWW.RESPONDEAI.COM.BR

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner cod = new Scanner(System.in);

		int codigo;
		String produto;
		double valor;

		System.out.println("Digite o código do produto: ");
		codigo = cod.nextInt();

		switch (codigo) {

		case 100:
			produto = "Detergente";
			valor = 1.59;
			System.out.printf("Produto: %s - Valor do produto: R$ %.2f.%n ", produto, valor);
			break;

		case 101:
			produto = "Esponja";
			valor = 4.59;
			System.out.printf("Produto: %s - Valor do produto: R$ %.2f.%n", produto, valor);
			break;
		case 102:
			produto = "Lã de Aço";
			valor = 1.79;
			System.out.printf("Produto: %S - Valor do produto: R$ %.2f.%n", produto, valor);
			break;
		default:
			System.out.println("Insira um código válido!");
			break;
		}

		cod.close();

	}

    
}
