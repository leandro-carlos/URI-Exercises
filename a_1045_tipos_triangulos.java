import java.util.Scanner;

public class a_1045_tipos_triangulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Double A1 = null;

		if (A > B && A > C) {
			A1 = A;
		} else if (B > A && B > C) {
			A1 = B;
		} else if (C > A && C > B) {
			A1 = C;
		}

		if (A >= (B + C)) {
			System.out.println("Não forma triangulo");
		}
	}

}
