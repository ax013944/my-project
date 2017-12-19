package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 1; i < 11; i++) {
			int n1 = r.nextInt(6) + 1;
			System.out.print(n1 + " ");
			int n2 = r.nextInt(6) + 1;
			System.out.print(n2 + " ");
			int n3 = r.nextInt(6) + 1;
			System.out.print(n3 + " ");
			int n4 = r.nextInt(6) + 1;
			System.out.print(n4 + " ");
			if (n1 != n2 && n2 != n3 && n3 != n4 && n4 != n1 && n1 != n3 && n2 != n4) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
