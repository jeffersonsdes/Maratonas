import java.util.Locale;
import java.util.Scanner;

public class league {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char time = sc.next().charAt(0);
		int pontos = sc.nextInt();
		int contA = 0;
		int contB = 0;

		while (time != 'F') {
			if (time == 'A') {
				contA = contA+pontos;

			} else if (time == 'B') {
				contB = contB+pontos;
			}
			time = sc.next().charAt(0);
			pontos = sc.nextInt();

		}
		System.out.println("TIME A MARCOU " + contA + " PONTOS");
		System.out.println("TIME B MARCOU " + contB + " PONTOS");
		
	}

}
