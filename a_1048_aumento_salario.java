import java.util.Scanner;

public class a_1048_aumento_salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		if (salario > 0 && salario <= 400) {

			double acrescentado = salario + (salario * 0.15);
			double reajuste = salario * 0.15;
			System.out.printf("Novo salario: %.2f%n", acrescentado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		} else if (salario <= 800) {
			double acrescentado = salario + (salario * 0.12);
			double reajuste = salario * 0.12;
			System.out.printf("Novo salario: %.2f%n", acrescentado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		} else if (salario <= 1200) {
			double acrescentado = salario + (salario * 0.1);
			double reajuste = salario * 0.1;
			System.out.printf("Novo salario: %.2f%n", acrescentado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		} else if (salario <= 2000) {
			double acrescentado = salario + (salario * 0.07);
			double reajuste = salario * 0.07;
			System.out.printf("Novo salario: %.2f%n", acrescentado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		} else {
			double acrescentado = salario + (salario * 0.04);
			double reajuste = salario * 0.04;
			System.out.printf("Novo salario: %.2f%n", acrescentado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}

	}

}
