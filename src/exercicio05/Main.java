 /* neste exercício vou gerar medias em metros de forma aleatória */
 
package exercicio05;

public class Main {
	public static void main(String[] args) {
		
		Distancia[] distancia = new Distancia[5];
		
		// entrada de dados --> geração de valores aleatórios
		for (int i = 0; i < distancia.length; i++) {
			distancia[i] = new Distancia(Math.random()*50);
		}
		
		// saída de dados
		for (Distancia d : distancia) {
			System.out.println("Distância em metros --> " + d.distancia);
			System.out.println("Distância em milhas --> " + d.paraMilhas());
			System.out.println("Distância em pés --> " + d.paraPes());
			System.out.println();
		}

	}
}
