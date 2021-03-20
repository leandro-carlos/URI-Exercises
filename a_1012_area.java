import java.util.*;

public class a_1012_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Double triangulo = (A*C)/2.0;
        double circulo = 3.14159 * (C * C);
		Double trapezio = ((A+B) * C)/2.0;
		Double quadrado = B * B;
		Double retangulo = A * B;
				
		System.out.println(String.format("TRIANGULO: %.3f",triangulo));
		System.out.println(String.format("CIRCULO: %.3f",circulo));
		System.out.println(String.format("TRAPEZIO: %.3f",trapezio));
		System.out.println(String.format("QUADRADO: %.3f",quadrado));
		System.out.println(String.format("RETANGULO: %.3f",retangulo));

	}

}
