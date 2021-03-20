import java.util.Locale;
import java.util.Scanner;

public class a_1038_lanche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		double totalCompra = 0;
		int cod = sc.nextInt();
		int quant = sc.nextInt();

		if (cod == 1) {
			totalCompra += quant * 4;
		} else if (cod == 2) {
			totalCompra += quant * 4.5;
		} else if (cod == 3) {
			totalCompra += quant * 5;
		} else if (cod == 4) {
			totalCompra += quant * 2;
		} else if (cod == 5) {
			totalCompra += quant * 1.5;
		}
		System.out.printf("Total: R$ %.2f ", totalCompra);
	}

}
