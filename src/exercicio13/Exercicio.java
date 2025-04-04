package exercicio13;

public class Exercicio {
	int x, y, z;
	static int a;

	public Exercicio(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getDados() {
		String aux = "";
		aux += "x = " + x + "\n";
		aux += "y = " + y + "\n";
		aux += "z = " + z + "\n";
		aux += "a = " + Exercicio.a + "\n";
		return aux;
	}
	
	public static void main(String[] args) {
		Exercicio e1 = new Exercicio(1, 2, 3);
		Exercicio e2 = new Exercicio(4, 1, 0);
		e1.x = e1.z + e2.x + e2.y + Exercicio.a;
		e2.y = 2*e1.x - e2.z;
		Exercicio.a = e2.x;
		e1.z = e2.z + e1.y;
		e2.z = e2.z + 2;
		Exercicio.a = 2* Exercicio.a + e1.y;

		System.out.println("e1:\n" + e1.getDados());
		System.out.println("e2:\n" + e2.getDados());
	}
}

