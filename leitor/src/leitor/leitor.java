package leitor;

import java.util.Scanner;

public class leitor {

	public static void main(String[] args) {
		int a, b, c, d, quadrado, quadrado2, quadrado3, quadrado4;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a \n");
		a = scan.nextInt();

		System.out.println("Digite b \n");
		b = scan.nextInt();
		System.out.println("Digite c \n");
		c = scan.nextInt();
		System.out.println("Digite d \n");
		d = scan.nextInt();
		quadrado = a * a;
		quadrado2 = b * b;
		quadrado3 = c * c;
		quadrado4 = d * d;
		if (c * c > 1000) {

			System.out.println("c^2 eh maior que 1000" + c * c);
		} else {
			System.out.println("A^2 : \n" + a * a);
			System.out.println("b^2 : \n" + b * b);
			System.out.println("c^2 : \n" + c * c);
			System.out.println("d^2 : \n" + d * d);
		}
	}

}
