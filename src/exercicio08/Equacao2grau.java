package exercicio08;

import java.text.DecimalFormat;

public class Equacao2grau {
	// variáveis de instância
	double a;
	double b;
	double c;
	
	// construtor
	public Equacao2grau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// método para calcular e retornar as raízes
	public String calcularRaiz() {
		DecimalFormat df = new DecimalFormat("0.00");
		String aux = "";
		double delta;
		double[] raiz = new double[2];
		
		delta = calcularDelta();
		if(delta < 0) {
			aux = "A equação não tem raiz real";
		} else {
			raiz[0] = (-b + Math.sqrt(delta)) / (2 * a);
			raiz[1] = (-b - Math.sqrt(delta)) / (2 * a);
			aux += "x1 = " + df.format(raiz[0]) + "\n";
			aux += "x2 = " + df.format(raiz[1]) + "\n";
		}
		return aux;		
	}
	
	// método para calcular e retornar o valor do delta
	private double calcularDelta() {
		return (b * b - 4 * a * c);
	}
	
}
