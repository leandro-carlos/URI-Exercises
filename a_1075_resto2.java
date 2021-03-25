import java.util.*;

public class a_1075_resto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i <= 10000; i++) {
			if (i % x == 2) {
				System.out.println(i);
			}
		}
	}

}
