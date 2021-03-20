import java.util.*;
public class a_1005_media_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a,b;
		a = sc.nextDouble();
		b = sc.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
	}
}

//