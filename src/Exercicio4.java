import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite uma palavra qualquer:");
		String palavra = sc.next();
		
		System.out.println(palavra.toUpperCase());

	}

}
