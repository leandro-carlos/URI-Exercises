import java.util.*;

public class a_1011_esfera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // (4/3) * pi * R3
		
		int n = sc.nextInt();
		
		Double volume = ( (4.0/3) * 3.14159 * Math.pow(n, 3)); 
		
		System.out.println(String.format("VOLUME = %.3f", volume));
	}

}
