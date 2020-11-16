package main;

import java.util.Scanner;

public class MaintT {

	public static void main(String[] args) {
		double e, p, m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o peso do tomate em kg \n");
		p = scan.nextDouble();
		m = 4 * (50 - p);
		e = 50 - p;
		if (p > 50) {
			m = 4 * (50 - p);
			e = 50 - p;
			System.out.println("excesso " + e);
			System.out.println("multa " + m);
		} else {
			e = 0;
			m = 0;
			System.out.println("multa e  excesso sao nulos, excesso: \n" + e);
			System.out.println("multa:  \n" + m);
		}

	}

}
