package exercicio08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Equacao2grau[] equacao = new Equacao2grau[5];
		double a, b, c;
		
		// para ser uma equação do 2o grau o valor de a deve ser diferente de zero
		for(int i = 0; i < equacao.length; ) {
			System.out.print("a --> ");
			a = sc.nextDouble();
			if(a != 0) {
				System.out.print("b --> ");
				b = sc.nextDouble();
				System.out.print("c --> ");
				c = sc.nextDouble();
				equacao[i++] = new Equacao2grau(a, b, c);
			} else {
				System.out.println("Não é uma equação do 2o grau");
			}
			System.out.println();
		}
		
		// impressão das raizes das equações do 2o grau
		for(Equacao2grau e : equacao) {
			System.out.println(e.calcularRaiz());
			System.out.println();
		}
	}
}
