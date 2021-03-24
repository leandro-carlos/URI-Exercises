import java.util.*;
import javax.swing.*;

public class a_1066_pares_impares_positivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram
		// pares,
//		quantos valores digitados foram ímpares, quantos valores digitados foram positivos 
//		e quantos valores digitados foram negativos.

		int contPar = 0, contInpar = 0, contPos = 0, contNeg = 0;

		for (int i = 0; i < 5; i++) {

			int num = sc.nextInt();
			if (num % 2 == 0) {
				contPar += 1;
			} else {
				contInpar += 1;
			}
			if (num > 0)
				contPos += 1;
			if (num < 0)
				contNeg += 1;
		}

		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contInpar + " valor(es) impar(es)");
		System.out.println(contPos + " valor(es) positivo(s)");
		System.out.println(contNeg + " valor(es) negativo(s)");
	}

}
