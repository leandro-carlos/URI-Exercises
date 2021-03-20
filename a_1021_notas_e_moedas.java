import java.util.Scanner;

public class a_1021_notas_e_moedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorEntrada = sc.nextDouble();

		// CÉDULAS

		int cem = (int) (valorEntrada / 100);
		valorEntrada -= cem * 100;

		int cinquenta = (int) (valorEntrada / 50);
		valorEntrada -= cinquenta * 50;

		int vinte = (int) (valorEntrada / 20);
		valorEntrada -= vinte * 20;

		int dez = (int) (valorEntrada / 10);
		valorEntrada -= dez * 10;

		int cinco = (int) (valorEntrada / 5);
		valorEntrada -= cinco * 5;

		int dois = (int) (valorEntrada / 2);
		valorEntrada -= dois * 2;

		// MOEDAS

		int um = (int) valorEntrada / 1;
		valorEntrada -= um * 1;

		int cinquentaCents = (int) (valorEntrada / 0.5);
		valorEntrada -= cinquentaCents * 0.5;

		int vinteCinco = (int) (valorEntrada / 0.25);
		valorEntrada -= vinteCinco * 0.25;

		int dezCents = (int) (valorEntrada / 0.10);
		valorEntrada -= dezCents * 0.10;

		int cincoCents = (int) (valorEntrada / 0.05);
		valorEntrada -= cincoCents * 0.05;

		int umCents = (int) (valorEntrada / 0.01);
		valorEntrada -= umCents * 0.01;

		// IMPRESSÃO TELA CÉDULAS

		System.out.println(
				
				"NOTAS: \n"+
				cem+" nota(s) de R$ 100.00\n"+
				cinquenta + " nota(s) de R$ 50.00\n"+
				vinte +  " nota(s) de R$ 20.00\n"+
				dez +  " nota(s) de R$ 10.00\n"+
				cinco + " nota(s) de R$ 5.00\n"+
				dois + " nota(s) de R$ 2.00"
				);
		
		// IMPRESSÃO TELA MOEDAS
		
		System.out.println(

					"MOEDAS: \n"+
					um+ " moeda(s) de R$ 1.00\n"+
					cinquentaCents+ " moeda(s) de R$ 0.50\n"+
					vinteCinco + " moeda(s) de R$ 0.25\n"+
					dezCents+ " moeda(s) de R$ 0.10\n"+
					cincoCents+ " moeda(s) de R$ 0.05\n"+
					umCents+ " moeda(s) de R$ 0.01\n"		
				);
			
//		System.out.println("NOTAS:");
//		System.out.println(cem + " nota(s) de R$ 100.00");
//		System.out.println(cinquenta + " nota(s) de R$ 50.00");
//		System.out.println(vinte + " nota(s) de R$ 20.00");
//		System.out.println(dez + " nota(s) de R$ 10.00");
//		System.out.println(cinco + " nota(s) de R$ 5.00");
//		System.out.println(dois + " nota(s) de R$ 2.00");
//		System.out.println("MOEDAS:");
//		System.out.println(um + " moeda(s) de R$ 1.00");
//		System.out.println(cincoCents + " moeda(s) de R$ 0.50");
//		System.out.println(vinteCinco + " moeda(s) de R$ 0.25");
//		System.out.println(dezCents + " moeda(s) de R$ 0.10");
//		System.out.println(cincoCents + " moeda(s) de R$ 0.05");
//		System.out.println(umCents + " moeda(s) de R$ 0.01");

	}

}
