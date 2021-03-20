import java.util.*;

public class a_1042_sort_simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];

		List<Integer> list = new ArrayList<>();

		// ALOCA MEMÓRIA PARA 10 INTEIROS

		for (int i = 0; i <= 2; i++) {
			num[i] = sc.nextInt();
			list.add(num[i]);
		}

		Arrays.sort(num);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);

		System.out.println();

		System.out.println(list+"\n");

	}

}
