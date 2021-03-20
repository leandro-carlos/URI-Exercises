import java.util.Scanner;

public class a_1019_conversao_de_tempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tempo = sc.nextInt();

		int hora = tempo / 3600;
		tempo = tempo % 3600;

		int minuto = tempo / 60;
		tempo = tempo % 60;

		System.out.println(String.format("%d:%d:%d", hora, minuto, tempo));

	}

}
