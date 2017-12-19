package com.ibm;

public class NineLazy {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int a = 2; a < 10; a++) {
				if (a * i < 10) {
					System.out.print(a + "*" + i + "= " + a * i + " ");
				} else {
					System.out.print(a + "*" + i + "=" + a * i + " ");
				}

			}
			System.out.println();
		}
	}
}
