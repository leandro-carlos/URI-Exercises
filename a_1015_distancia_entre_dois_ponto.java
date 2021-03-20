import java.util.Locale;
import java.util.Scanner;

public class a_1015_distancia_entre_dois_ponto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		// (x2 - x1) ² + (y2 - y1)²

		double firstPot = (x2 - x1);
		double secondPot = (y2 - y1);

		double distanciaTot = Math.pow(firstPot, 2) + Math.pow(secondPot, 2);
		double result = Math.sqrt(distanciaTot);

		System.out.println(String.format("%.4f", result));

	}

}
