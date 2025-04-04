package exercicio14;

public class Exercicio {
    int a, b;

    public Exercicio() {
        this(0, 0);
    }

    public Exercicio(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getDados() {
        String aux = "";
        aux += "a = " + a + "\n";
        aux += "b = " + b + "\n";
        return aux;
    }
}

