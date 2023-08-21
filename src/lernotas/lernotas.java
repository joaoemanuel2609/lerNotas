package lernotas;

import java.util.Scanner;

public class lernotas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] nota = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("digite a nota de um aluno");
			nota[i] = sc.nextDouble();

		}

		double soma = 0;
		for (double resultado : nota) {

			soma += resultado;
		
		}
		System.out.println(soma/nota.length);
	}

}
