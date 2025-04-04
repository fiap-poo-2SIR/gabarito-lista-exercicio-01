/* neste exercício os objetos serão inseridos em um array de objeto */

package exercicio01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Bicicleta[] bicicleta = new Bicicleta[2];
		String cor;
		int numeroMarcha;
		double valor;
		
		// entrada de dados
		for (int i = 0; i < bicicleta.length; i++) {
			System.out.println("Bicicleta " + (i+1) + ": ");
			System.out.print("Cor: ");
			cor = teclado.next();
			System.out.print("Número de marchas: ");
			numeroMarcha = teclado.nextInt();
			System.out.print("Valor: ");
			valor = teclado.nextDouble();
			bicicleta[i] = new Bicicleta(cor, numeroMarcha, valor);
			System.out.println();			
		}
		
		// saída de dados
		for (Bicicleta b : bicicleta) {
			System.out.println(b.getDados());
		}

	}
}
