import java.util.*;

public class a_1072_intervalo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 1, intervalo = 0, fora = 0;

		int num = sc.nextInt();

		while (cont <= num) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20)
				intervalo++;
			else {
				fora++;
			}
			cont++;
		}
		System.out.println(intervalo+ " in");
		System.out.println(fora+" out");
	}

}
