import java.util.Scanner;

public class a_1020_idade_em_dias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idadeDias = sc.nextInt();

		int ano = idadeDias / 365;
		idadeDias -= ano * 365;

		int mes = idadeDias / 30;
		idadeDias = idadeDias - mes * 30;

		int dias = idadeDias;

		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dias+" dia(s)");

	}

}
