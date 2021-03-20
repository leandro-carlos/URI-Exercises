import java.util.Scanner;

public class a_1023_formula_bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A, B, C;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		double delta = (B * B - 4 * A * C);
		double raizTeste = Math.sqrt(delta);

		double x1 = (-B + Math.sqrt(delta)) / (2 * A);
		double x2 = (-B - Math.sqrt(delta)) / (2 * A);

		if ((A == 0) | (B * B - 4 * A * C < 0)) {
			System.out.println("Impossivel calcular");
			return;
		}

		System.out.println(String.format("R1 = .5f", x1));
		System.out.println(String.format("R2 = .5f", x2));

	}

}
