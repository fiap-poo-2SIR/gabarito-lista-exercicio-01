package exercicio04;

public class Temperatura {
	// variáveis de instância
	double temperatura;
	
	// neste exercício não vou utilizar o construtor (estou revezando)
	
	// método para converter para Fahrenheit
	public double paraFahrenheit() {
		double f;
		f = 9 / 5 * temperatura + 32;
		return f;
	}
	
	// método para converter para Kelvin
	public double paraKelvin() {
		double k;
		k = temperatura + 273;
		return k;
	}
}
