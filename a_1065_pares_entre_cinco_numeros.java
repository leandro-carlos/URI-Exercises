import java.util.*;

public class a_1065_pares_entre_cinco_numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0)
				cont += 1;
		}
		System.out.println(cont+" valores pares");

	}

}
