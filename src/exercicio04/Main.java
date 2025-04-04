/* neste exercício vou gerar alguns valores aleatórios como temperatura celius */

package exercicio04;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		Temperatura[] temp = new Temperatura[5];
		
		// entrada de dados
		for (int i = 0; i < temp.length; i++) {
			temp[i] = new Temperatura();
			temp[i].temperatura = Math.random() * 10;
		}
		
		// saída de dados (exibe a temperatura celsius e seus valores convertidos
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Celius --> " + temp[i].temperatura);
			System.out.println("Fahrenheit --> " + temp[i].paraFahrenheit());
			System.out.println("Kelvin --> " + temp[i].paraKelvin());
			System.out.println();			
		}
	}
}
