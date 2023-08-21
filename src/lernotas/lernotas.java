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
		double nb =0;
		double nt=0;
		double soma = 0;
		for (double resultado : nota) {
			
			if(resultado<6) {
				nb = nb+1;
			}else {
			nt = nt+1;
			}
			soma += resultado;
		}
		System.out.println("media das notas "+soma/nota.length);
		System.out.println("notas abaixo de 6 foram "+ nb);
		System.out.println("notas acima de 6 foram "+nt);
		
	}

}
