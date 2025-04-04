package exercicio14;

public class Teste {
    public static void main(String[] args) {
        Exercicio e1 = new Exercicio();
        Exercicio e2 = new Exercicio(5, 3);
        Misterio m = new Misterio();
        e1 = m.misterio(e1);
        e2 = m.misterio(e2);

        System.out.println(e1.getDados());
        System.out.println(e2.getDados());

    }
}

