// serão gerados 5 círculos usando raio aleatório

package exercicio09;

public class Main {
	public static void main(String[] args) {

		Circulo[] circulo = new Circulo[5];
		
		// geração dos círculos
		for(int i = 0; i < circulo.length; i++) {
			circulo[i] = new Circulo(Math.random()*10);
		}
		
		// saída dos dados (impressão da área e do perímetro)
		for (Circulo c : circulo) {
			System.out.println("área --> " + c.calcularArea());
			System.out.println("perímetro --> " + c.calcularPerimetro());
			System.out.println();
		}

	}
}
