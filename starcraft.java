import java.util.Locale;
import java.util.Scanner;

public class starcraft {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cont = 0;

		for (int i = 0; i < N; i++) {
			int saldodia = sc.nextInt();

			cont += saldodia;

		}
		System.out.println(cont);

	}

}
