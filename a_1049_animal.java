import java.util.Scanner;

public class a_1049_animal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String tipo = leitor.next();
		String classe = leitor.next();
		String comida = leitor.next();
		if (tipo.equalsIgnoreCase("vertebrado")) {
			if (classe.equalsIgnoreCase("ave")) {
				if (comida.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (comida.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (classe.equalsIgnoreCase("inseto")) {
				if (comida.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (comida.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}
	}

}