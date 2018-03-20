package com.java2.object;

import java.util.Scanner;

public class ABtester {

	public static void main(String[] args) {
		String secret = "1245";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("Please enter numbers");
	        ABCNumber n = new ABCNumber(scanner.nextLine());
			result = n.validate(secret);
			System.out.print((result / 10) + "A" + (result / 10) + "B");

		}
	}
}
