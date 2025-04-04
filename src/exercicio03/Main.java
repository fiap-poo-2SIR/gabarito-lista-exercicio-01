package exercicio03;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Retangulo[] retangulo = new Retangulo[2];
		double base, altura;
		
		// entrada de dados
		for (int i = 0; i < retangulo.length; i++) {
			System.out.println("Retângulo " + (i+1) + ": ");
			System.out.print("Base --> ");
			base = teclado.nextDouble();
			System.out.print("Altura --> ");
			altura = teclado.nextDouble();
			retangulo[i] = new Retangulo(base, altura);
			System.out.println();
		}
		
		// saída de dados (aqui vou usar o for tradicional)
		for (int i = 0; i < retangulo.length; i++) {
			System.out.println("Retângulo " + (i+1) + ": ");
			System.out.println("Área: " + retangulo[i].calcularArea());
			System.out.println("Perímetro: " + retangulo[i].calcularPerimetro());
			System.out.println();
		}
	}
}
