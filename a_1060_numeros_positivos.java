import java.util.*;

public class a_1060_numeros_positivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		for (int i = 0; i < 6; i++) {
			int num = sc.nextInt();
			if (num > 0) {
				cont += 1;
			}
		}
		System.out.println(cont + " valores positivos");

	}

}
