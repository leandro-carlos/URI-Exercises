import java.util.*;

public class a_1010_calculo_simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod1, numpec1;
		int cod2, numpec2;
		
		Double valorunit1, valorunit2;
		
		cod1 = sc.nextInt();
		numpec1 = sc.nextInt();
		valorunit1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		numpec2 = sc.nextInt();
		valorunit2 = sc.nextDouble();
		
		Double totalCompra = ( ( numpec1 * valorunit1) + ( numpec2 * valorunit2));
		
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", totalCompra));   

	}

}




