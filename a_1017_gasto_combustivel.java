import java.util.Scanner;

public class a_1017_gasto_combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horas = sc.nextDouble();
		double velocidade = sc.nextDouble();
		
		// 12km/l
		
		double result = (horas * velocidade) / 12;
		
		System.out.println(String.format("%.3f", result));
	}

}
