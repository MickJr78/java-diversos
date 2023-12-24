import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int a, b, s;
		// System.out.println("EXERCÍCIO #1 - SOMA ENTRE NÚMEROS");
		// System.out.println("Digite dois números");
		// a = sc.nextInt();
		// b = sc.nextInt();
		// s = a + b;

		// System.out.printf("A soma de %d e %d é igual a %d.\n ", a, b, s);

		// System.out.println();
		// System.out.println("===========================================================================");
		// double pi, raio, area;

		// pi = 3.14159;
		// raio = 0;

		// System.out.println("EXERCÍCIO #2 - RAIO DE UM CÍRCULO COM 4 CASAS DECIMAIS");
		// System.out.println("Digite o valor do raio do círculo: ");
		// raio = sc.nextDouble();
		// area = pi * (Math.pow(raio,2.0));
		// System.out.printf("O valor da área do círculo é %.4f.\n",area);

		// System.out.println();
		// System.out.println("===========================================================================");
		// int a, b, c, d, dif;

		// System.out.println("EXERCÍCIO #3 - CÁLCULO DE PRODUTOS DE VALORES INTEIROS");
		// System.out.println("Digite os valores a serem calculados: ");
		// a = sc.nextInt();
		// b = sc.nextInt();
		// c = sc.nextInt();
		// d = sc.nextInt();

		// dif = (a*b) - (c*d);
		// System.out.printf("A diferença do produto de %d x %d por %d x %d é igual a
		// %d.\n",a,b,c,d, dif);

		// System.out.println();
		// System.out.println("===========================================================================");
		// double valorHora, salario;
		// int numero, horaTrabalhada;

		// System.out.println("EXERCÍCIO #4 - CÁLCULO DE SALÁRIO MEDIANTE HORAS
		// TRABALHADAS");
		// System.out.println("Digite o número do funcionário ");
		// numero = sc.nextInt();
		// System.out.println("Agora, digite o número de horas que ele trabalhou: ");
		// horaTrabalhada = sc.nextInt();
		// System.out.println("Finalmente, digite o valor da hora do funcionário: ");
		// valorHora = sc.nextDouble();

		// salario = horaTrabalhada*valorHora;

		// System.out.printf("O funcionário numero %d trabalhou %d horas e deverá
		// receber U$ %.2f.\n",numero,horaTrabalhada,salario);

		// System.out.println();
		// System.out.println("===========================================================================");
		// System.out.println("EXERCÍCIO #5 - CÁLCULO DE VALOR DE VENDA DE PEÇAS");

		// int codPeca1, codPeca2,qtdPeca1, qtdPeca2;
		// double valorPeca1, valorPeca2, total1,total2, valorTotal;

		// System.out.println("Digite o código da peça #1: ");
		// codPeca1 = sc.nextInt();
		// System.out.println("Quantidade:");
		// qtdPeca1 = sc.nextInt();
		// System.out.println("Valor da peça: ");
		// valorPeca1 = sc.nextDouble();

		// total1 = valorPeca1*qtdPeca1;

		// System.out.println("Digite o código da peça #2: ");
		// codPeca2 = sc.nextInt();
		// System.out.println("Quantidade:");
		// qtdPeca2 = sc.nextInt();
		// System.out.println("Valor da peça: ");
		// valorPeca2 = sc.nextDouble();
		// total2 = valorPeca2*qtdPeca2;

		// valorTotal = total1 + total2;

		// System.out.printf("RESUMO: \n%d unidades da peça código %d, com valor
		// unitário de %.2f, \nmais %d unidades da peça código %d, com valor \nunitário
		// de %.2f.", qtdPeca1,codPeca1,valorPeca1,qtdPeca2,codPeca2,valorPeca2);
		// System.out.printf("VALOR TOTAL A PAGAR: %.2f\n", valorTotal);

		// System.out.println();
		// System.out.println("===========================================================================");
		// System.out.println("EXERCÍCIO #5 - CÁLCULO DE VALOR DE VENDA DE PEÇAS");

		// System.out.println();
		// System.out.println("===========================================================================");
		// System.out.println("EXERCÍCIO #6 - CÁLCULO DE ÁREA DE FIGURAS GEOMÉTRICAS");

		// double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;

		// System.out.println("Digite o valor de A: ");
		// A = sc.nextDouble();
		// System.out.println("Digite o valor de B: ");
		// B = sc.nextDouble();
		// System.out.println("Digite o valor de C: ");
		// C = sc.nextDouble();

		// pi = 3.14159;
		// triangulo = (A*C)/2;
		// circulo = pi * (Math.pow(C,2.0));
		// trapezio = ((A+B)*C)/2;
		// quadrado = B*B;
		// retangulo = A*B;

		// System.out.printf("Triângulo - %.3f\n", triangulo);
		// System.out.printf("Círculo - %.3f\n", circulo);
		// System.out.printf("Trapézio - %.3f\n", trapezio);
		// System.out.printf("Quadrado - %.3f\n", quadrado);
		// System.out.printf("Retângulo - %.3f\n", retangulo);

		// System.out.println();
		// System.out.println("===========================================================================");
		// System.out.println("EXERCÍCIO #7 - CÁLCULO DE HORAS DE DURAÇÃO DE UM JOGO");

		// int inicio, fim, duracao;

		// System.out.println("Digite o horario de INICIO da partida: ");
		// inicio = sc.nextInt();

		// System.out.println("Digite o horário de FINAL da partida: ");
		// fim = sc.nextInt();

		// if (inicio < fim) {
		// duracao = fim - inicio;
		// } else {
		// duracao = 24 - inicio + fim;
		// }

		// System.out.printf("O jogo durou " + duracao + " horas;");

		// System.out.println();
		// System.out.println("===========================================================================");
		// System.out.println("EXERCÍCIO #8 - CÁLCULO DE PEDIDO DE LANCHE");

		// int codigo, quantidade;
		// double preco, total;

		// preco = 0;

		// System.out.println("Digite o código do lanche desejado: ");
		// codigo = sc.nextInt();

		// System.out.println("Agora digite a quantidade desejada: ");
		// quantidade = sc.nextInt();

		// if (codigo == 1) {
		// preco = 4.50f;
		// } else if (codigo == 2) {
		// preco = 4.50f;
		// } else if (codigo == 3) {
		// preco = 5.00f;
		// } else if (codigo == 4) {
		// preco = 2.00f;
		// } else if (codigo == 5) {
		// preco = 1.50f;
		// } else {
		// System.out.println("Item não existe. Escolha uma opção de 1 a 5.");
		// }

		// total = quantidade * preco;

		// System.out.printf("Valor a pagar: R$ %.2f\n", total);

		//System.out.println();
		//System.out.println("===========================================================================");
		//System.out.println("EXERCÍCIO #9 - FAIXAS DE INTERVALOS NUMÉRICOS");

		//double valor;

		//System.out.println("Digite um número e eu te direi em qual intervalo ele está: ");
		//valor = sc.nextDouble();

		//if (valor < 0 || valor > 100) {
		//	System.out.println("Fora de intervalo!");
		//} else if (valor == 0.00 || valor <= 25.00) {
		//	System.out.println("Intervalo [0 , 25]");
		//} else if (valor > 25.00 || valor <= 50.00) {
		//	System.out.println("Intervalo [25 , 50]");
		//} else if (valor > 50.00 || valor <= 75.00) {
		//	System.out.println("Intervalo [50 , 75]");
		//} else if (valor > 75.00 || valor <= 100) {
		//	System.out.println("Intervalo [75 , 100]");
		//}

		sc.close();

	}

}
