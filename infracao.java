import java.util.Locale;
import java.util.Scanner;

public class infracao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int V = sc.nextInt();
		
		int vExedida = V - M;
		System.out.println(vExedida);

	}

}
