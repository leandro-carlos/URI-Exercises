import java.util.*;

public class a_1007_Diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,DIFERENCA;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		DIFERENCA = (a * b - c * d);
		
		System.out.println("DIFERENCA = "+DIFERENCA );
	}

}