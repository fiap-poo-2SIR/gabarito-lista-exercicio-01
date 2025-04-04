package exercicio05;

public class Distancia {
	// variáveis de instância
	double distancia; 

	// aqui estou definindo o método construtor
	public Distancia(double distancia) {
		this.distancia = distancia;
	}
	
	// método para converter para pés
	public double paraPes() {
		return distancia * 3.28084;
	}
	
	// método para converter para milhas
	public double paraMilhas() {
		return distancia * 0.000621371;
	}	
}
