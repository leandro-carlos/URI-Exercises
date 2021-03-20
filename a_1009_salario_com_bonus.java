import java.util.*;

public class a_1009_salario_com_bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Double salario, vendas, lastMonth;
		Double comissao = 0.15;

		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();

		lastMonth = (salario + (vendas * comissao));

		System.out.println(String.format("TOTAL = R$ %.2f", lastMonth));

	}

}
