import java.util.Scanner;

public class a_1014_consumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int distancia;
		double totComb;

		distancia = sc.nextInt();
		totComb = sc.nextDouble();

		double pLitro = (distancia / totComb);

		System.out.println(String.format("%.3f km/l", pLitro));
	}

}
