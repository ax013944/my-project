package com.well;

public class While {

	public static void main(String[] args) {
		int n1 = 0;
		while (n1 <= 9) {
			n1++;
			if (n1 % 3 == 0) {
				continue;
			}
			System.out.print(n1 + " ");
		}

	}

}
