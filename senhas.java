import java.util.Locale;
import java.util.Scanner;

public class senhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha1 = sc.nextInt();

		while (senha1 != 8294) {
			System.out.println("SENHA INCORRETA");
			senha1 = sc.nextInt();

		}
		int senha2 = sc.nextInt();

		while (senha2 != 2071) {
			System.out.println("SENHA INCORRETA");
			senha2 = sc.nextInt();
		}
		System.out.println("COFRE ABERTO");
	}

}
