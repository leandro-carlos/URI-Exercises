import java.util.*;

public class a_1008_salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double hourWork,winWork, salary;
		int numFunc;
		
		numFunc = sc.nextInt();
		hourWork = sc.nextDouble();
		winWork = sc.nextDouble();
		
		salary = hourWork * winWork;
		
		
		
		
		System.out.println("NUMBER = "+numFunc);
		System.out.println(String.format("SALARY = U$ %.2f", salary));
	}

}
