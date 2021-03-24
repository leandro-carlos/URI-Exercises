import java.util.*;

public class a_1073_quadrado_de_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i < x + 1; i++) {
			if (i % 2 == 0) {
				int res = i * i;
				System.out.println(i + "^2 = " + res);
			}
		}
	}

}
