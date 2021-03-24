import java.util.*;

public class a_1070_seis_numeros_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int x = sc.nextInt();
		
		for (int i = x; i < x + 12 ; i++ )
			if (!(i % 2 == 0))
				System.out.println(i);
	}

}
