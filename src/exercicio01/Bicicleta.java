package exercicio01;

import java.text.DecimalFormat;

public class Bicicleta {
	// variáveis de instância
	String cor;
	int numeroMarcha;
	double valor;
	
	// construtor da classe
	public Bicicleta(String cor, int numeroMarcha, double valor) {
		this.cor = cor;
		this.numeroMarcha = numeroMarcha;
		this.valor = valor;
	}
	
	// método para retornar os dados
	public String getDados() {
		DecimalFormat df = new DecimalFormat("0.00");
		String aux = "";
		aux += "Cor: " + cor + "\n";
		aux += "Número de marchas: " + numeroMarcha + "\n";
		aux += "Valor: R$ " + df.format(valor) + "\n";
		return aux;		
	}	
}
