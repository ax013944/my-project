package com.well;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		System.out.print("請輸入你的數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int f = Integer.parseInt(line);
		if (f % 2 == 1) {
			System.out.println("是奇數");
		} else {
			System.out.println("是偶數");
		}
		System.out.println("請輸入你的年齡:");
		String line2 = scanner.nextLine();
		int age = Integer.parseInt(line2);
		if (age > 25) {
			System.out.print("你可以滾了");
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
