import java.util.Scanner;

public class a_1044_multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
		System.out.println("Nao sao Multiplos");
		}
	}
}