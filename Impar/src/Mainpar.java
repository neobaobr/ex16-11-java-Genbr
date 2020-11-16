import java.util.Scanner;

public class Mainpar {

	public static void main(String[] args) {
		int numero;
		System.out.println("digite um num para saber a paridade");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		if (numero % 2 == 0) {
			if (numero < 0) {
				System.out.println("o numero eh divisivel por 2 , portanto eh par , alem disso eh negativo\n" + numero);
			}
			if (numero < 0) {
				System.out.println("o numero eh divisivel por 2 , portanto eh par , alem disso eh positivo\n" + numero);
			}
		}

		else {
			if (numero > 0) {
				System.out.println(
						"o numero digitado eh impar, pois nao eh divisivel por 2,tambem eh positivo \n" + numero);
			}

			if (numero < 0)
				System.out.println(
						"o numero digitado eh impar, pois nao eh divisivel por 2,tambem eh negativo \n" + numero);
		}

	}

}
