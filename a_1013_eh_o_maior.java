import java.io.IOException;
import java.util.Scanner;

public class a_1013_eh_o_maior {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();
        int valor3 = leitor.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
        	System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
        	System.out.println(valor2 + " eh o maior");
        } else {
        	System.out.println(valor3 + " eh o maior");
        }
    }
	
}