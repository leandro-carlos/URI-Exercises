import java.util.Scanner;

public class a_1047_tempo_de_jogo_c_minutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hInicial = sc.nextInt();
		int mInicial = sc.nextInt();

		int hFinal = sc.nextInt();
		int mFinal = sc.nextInt();

		int hResult = 0;
		int mResult = 0;

		if (mInicial > mFinal) {
			mResult = 60 - (mInicial - mFinal);
		} else if (mFinal > mInicial) {
			mResult = mFinal - mInicial;
		}

		if (hInicial > hFinal) {
			hResult = 24 - (hInicial - hFinal);
			System.out.println("O JOGO DUROU " + hResult + " HORA(S) E " + mResult + " MINUTO(S)");

		} else if (hFinal > hInicial) {
			hResult = hFinal - hInicial;
			System.out.println("O JOGO DUROU " + hResult + " HORA(S) E " + mResult + " MINUTO(S)");

		} else {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
	}

}
