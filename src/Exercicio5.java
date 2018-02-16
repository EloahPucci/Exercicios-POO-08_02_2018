import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite a primeira palavra:");
		String palavra1 = sc.next();
		
		System.out.println("Digite a segunda palavra:");
		String palavra2 = sc.next();
		
		System.out.println();
		
		if(palavra1.equals(palavra2)) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");
		}

	}

}
