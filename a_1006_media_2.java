import java.util.*;

public class a_1006_media_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Double a,b,c, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = ( (2*a) + (b*3) + (c*5) ) /10;
		System.out.println(String.format("MEDIA = %.1f",media));
	}}