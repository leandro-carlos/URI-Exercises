import java.util.Scanner;

public class a_1022_teste_de_selecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		if (B > C && D > A && (C + D) > (A + B) && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
	}

}
