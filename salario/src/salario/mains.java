package salario;

import java.util.Scanner;

public class mains {

	public static void main(String[] args) {
		int horas, salario = 0, extra = 0, total,codigo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero de horas trabalhadas \n");	
		horas = scan.nextInt();
		System.out.println("Digite o numero de codigo de trabalhor \n");
		codigo= scan.nextInt();

		salario = 10 * horas;
		extra = (horas - 50) * 20;

		if (horas > 50) {
			total = salario + extra - (horas - 50) * 10;
			System.out.println("codigo do trabalhador\n"+codigo);
			System.out.println("salario \n" + total);
		} else {
			extra = 0;
			System.out.println("codigo do trabalhador\n"+codigo);
			System.out.println("Salario \n");
			System.out.println(+salario);
		}

	}

}

