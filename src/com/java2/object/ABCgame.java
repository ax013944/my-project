package com.java2.object;

import java.util.Scanner;

public class ABCgame {
	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter numbers");
		String secret = "1245";
		while (A != 4) {
			String nums = scanner.nextLine();
			int length = secret.length();
			for (int i = 0; i < nums.length(); i++) {
				char c = nums.charAt(i);
				for (int j = 0; j < length; j++) {
					if (c == secret.charAt(j)) {
						if (i == j) {A++;} 
						else {B++;};
						break;
					}
				}
			}
			System.out.print(A + "A" + B + "B");
			 A = 0;
			 B = 0;
		}
	}
}