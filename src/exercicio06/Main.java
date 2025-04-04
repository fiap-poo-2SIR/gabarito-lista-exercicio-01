package exercicio06;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(23, 45, 2);
        Hora h2 = new Hora(3, 30, 0);
        Hora h3 = new Hora(48, 125, 963);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());
    }
}
