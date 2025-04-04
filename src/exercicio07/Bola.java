package exercicio07;

public class Bola {
    private String cor;
    private double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public Bola maiorBola(Bola a, Bola b) {
        Bola aux = null;
        if(this.raio > a.raio && this.raio > b.raio) {
            aux = this;
        }
        else if(a.raio > b.raio) {
            aux = a;
        }
        else {
            aux = b;
        }
        return aux;
    }

    public String retornarDados() {
        return cor + " " + raio;
    }

}
