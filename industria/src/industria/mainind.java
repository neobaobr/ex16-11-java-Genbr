package industria;

import java.util.Scanner;

public class mainind {

	public static void main(String[] args) {
		double p;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o indice \n");
		p = scan.nextDouble();

		if (p > 0.3 && p < 0.4) {
			System.out.println("grupo1 pare de produzir poluicao em \n " + p);

		}
		if (p > 0.4 && p < 0.5) {
			System.out.println("grupo1 e grupo2 pare de produzir poluicao em \n " + p);
			if (p > 0.5) {
				System.out.println("todos devem parar de produzir " + p);
			}

		}

	}
}
