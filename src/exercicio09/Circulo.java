package exercicio09;

public class Circulo {
	// variáveis de instância
	double raio;
	
	// construtor
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	// método para calcular e retornar a área
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
	
	// método para calcular e retornar o perímetro
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
	
	// método para alterar o valor do raio
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	// método para retornar o valor do raio
	public double getRaio() {
		return raio;
	}
}
