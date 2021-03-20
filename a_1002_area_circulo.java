import java.util.*;
import java.text.DecimalFormat; 

public class a_1002_area_circulo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Double area;
	Double raio = sc.nextDouble();
	area =  3.14159 * Math.pow(raio, 2);
	System.out.printf("A=%.4f",area);
	}

}
