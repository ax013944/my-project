package com.well;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		System.out.print("�п�J�A���Ʀr:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int f = Integer.parseInt(line);
		if (f % 2 == 1) {
			System.out.println("�O�_��");
		} else {
			System.out.println("�O����");
		}
		System.out.println("�п�J�A���~��:");
		String line2 = scanner.nextLine();
		int age = Integer.parseInt(line2);
		if (age > 25) {
			System.out.print("�A�i�H�u�F");
		} else {
			if (age <= 25) {

				for (int i = 1; i < 5; i = i + 1) {
					System.out.println("too young too simple");
				}
			}
		}
		for (int i = 1; i < 5; i = i + 1) {
			System.out.println("2 x " + i + " =  " + (i * 2));
		}
		for (int i = 5; i < 10; i = i + 1) {
			System.out.println("2 x " + i + " = " + (i * 2));

		}
		for (int n = 2; n < 10; n = n + 1) {
			for (int i = 1; i < 10; i = i + 1) {
				if (i * n < 10) {
					System.out.print(n + " x " + i + " =  " + (i * n) + " ");

				} else {
					System.out.print(n + " x " + i + " = " + (i * n) + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
