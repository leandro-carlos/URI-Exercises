import java.util.*;

public class a_1040_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double N1, N2, N3, N4, media;

		N1 = sc.nextDouble();
		N2 = sc.nextDouble();
		N3 = sc.nextDouble();
		N4 = sc.nextDouble();

		media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;

		if (media >= 7) {
			System.out.println("Media: " + media);
			System.out.println("Aluno aprovado.");
		} else if (media < 5) {
			System.out.println("Media: " + media);
			System.out.println("Aluno reprovado.");
		} else {

			System.out.println("Aluno em exame.\n");
			double exame = sc.nextDouble();
			System.out.println("Nota do exame: " + exame);

			double mediaExame = (media + exame) / 2;
			if (mediaExame >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + mediaExame);
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + mediaExame);

			}
		}
	}

}
