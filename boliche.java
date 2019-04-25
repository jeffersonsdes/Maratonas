import java.util.Locale;
import java.util.Scanner;

public class boliche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fim = 0;
		
		for(int i=1; i<=n; i++) {
			fim = i +fim;
		}
		System.out.println(fim);
	}

}
