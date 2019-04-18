import java.util.Locale;
import java.util.Scanner;

public class notascg {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			float nota1 = sc.nextFloat();
			float nota2 = sc.nextFloat();
			float nota3 = sc.nextFloat();

			float total = nota1 + nota2 + nota3;
			System.out.printf("%.2f%n",total);

		}

	}

}
