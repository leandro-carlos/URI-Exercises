import java.util.Scanner;

public class a_1016_distancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int km = sc.nextInt();

        double time = (60 * km) / 30;
		
		System.out.println(String.format("%.0f Minutos", time));

}
}