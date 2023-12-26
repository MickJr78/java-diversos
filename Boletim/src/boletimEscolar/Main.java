package boletimEscolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, part, media;

		System.out.println("Digite os valores das três notas a seguir: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();

		System.out.println("Agora, digite o percentual de participação do aluno: ");
		part = sc.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

// ESTOU CONSCIENTE DE QUE O PROCESSO REAL NÃO FUNCIONA ASSIM, FIZ APENAS AS INCLUSÕES DE CONDIÇÕES EXTRAS 
		//PARA TESTAR O NÍVEL DE ALCANCE DE UMA CONDIÇÃO TERNÁRIA, ANINHANDO OUTRAS AVALIAÇÕES.

		String result = (media > 7 && media <= 9.99) ? "O ALUNO ESTÁ APROVADO."
				: (media < 7) ? "O ALUNO ESTÁ REPROVADO" : (media == 10 && part >50) ? "APROVADO COM DISTINÇÃO. PARABÉNS!"
						: (media == 10 && part < 50)? "SERÁ APROVADO APÓS AVALIAÇÃO PARTICIPATIVA":"";

		System.out.printf("Média %.1f. %s", media, result);

		sc.close();

	}

}
