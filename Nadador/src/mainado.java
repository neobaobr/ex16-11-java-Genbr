import java.util.Scanner;

public class mainado {

	public static void main(String[] args) {
		int idade;

		Scanner scan = new Scanner(System.in);

		idade = scan.nextInt();

		if (idade > 4 && idade < 8) {
			System.out.println("categoria inf A \n" + idade);
		}
		if (idade > 7 && idade < 12) {
			System.out.println("categoria inf B \n" + idade);
		}
		if (idade > 11 && idade < 14) {
			System.out.println("categoria juven A \n" + idade);
		}
		if (idade > 13 && idade < 18) {
			System.out.println("categoria juvem B \n" + idade);
		}

		if (idade > 17) {
			System.out.println("categoria adulto \n" + idade);

		}

		if (idade < 5) {
			System.out.println("categoria nao comtemplada, nadador muito novo para competir \n" + idade);
		}

	}

}
