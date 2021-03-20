import java.util.Scanner;

public class a_1037_intervalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();

		if ((int) X >= 0 && X <= 25) {
			System.out.println(" Intervalo (0,25]");
		} else if ((int) X >= 25 && X <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if ((int) X >= 50 && X <= 75) {
			System.out.println("Intervalo [50,75]");
		} else if ((int) X >= 75 && X <= 100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}
	}

}
