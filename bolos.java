import java.util.Locale;
import java.util.Scanner;

public class bolos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoBolo = sc.nextDouble();
		int N = sc.nextInt();
		double cont = 0;

		for (int i = 0; i < N; i++) {
			int qtdeBolos = sc.nextInt();
			cont += qtdeBolos * precoBolo;

		}
		System.out.printf("%.2f%n", cont);

	}

}
