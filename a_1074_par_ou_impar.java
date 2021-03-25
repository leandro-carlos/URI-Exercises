import java.util.*;

public class a_1074_par_ou_impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x;) {
			i++;
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("NULL");
			} else if (num % 2 == 0) {
				if (num > 0) {
					System.out.println("EVEN POSITIVE ");
				} else {
					System.out.println("EVEN NEGATIVE");
				}
			} else {
				if (num > 0) {
					System.out.println("ODD POSITIVE");
				} else {
					System.out.println("ODD NEGATIVE");
				}
			}
		}
	}
}
