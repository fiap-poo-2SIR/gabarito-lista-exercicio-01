/* lembrando que para a digitação dos lados, temos que verificar
 * se os valores informados formam realmente um triângulo. Do conceito matemático,
 * para que três lados formem os lados de um triângulo é necessário que cada um dos
 * lados seja menor que a soma dos outros dois. É um conceito matemático e não de 
 * programação.
 */

package exercicio10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Triangulo[] triangulo = new Triangulo[3];
		int a, b, c;
		
		// entrada de dados
		for(int i = 0; i < triangulo.length; ) {
			System.out.print("Lado 1 --> ");
			a = teclado.nextInt();
			System.out.print("Lado 2 --> ");
			b = teclado.nextInt();
			System.out.print("Lado 3 --> ");
			c = teclado.nextInt();
			if(validar(a, b, c)) {
				triangulo[i++] = new Triangulo(a, b, c);
			} else {
				System.out.println("Os valores informados não formam um triângulo");
			}
			System.out.println();
		}
		
		// saída de dados
		for (Triangulo t : triangulo) {
			System.out.println("área: " + t.calcularArea());
			System.out.println("perímetro: " + t.calcularPerimetro());
			System.out.println("centróide x: " + t.centroideX());
			System.out.println("centróide y: " + t.centroideY());
			System.out.println();
		}
	}

	private static boolean validar(int a, int b, int c) {
		if(a < b + c && b < a + c && c < a + b) {
			return true;
		}
		return false;
	}
}
