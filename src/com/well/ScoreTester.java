package com.well;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數:");
		String line = scanner.nextLine();
		int f = Integer.parseInt(line);
		int point = f / 10;
		switch (point) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("failed");
			break;
		case 6:
			System.out.println("passed");
			break;
		case 7:
			System.out.println("good");
			break;
		case 8:
			System.out.println("great");
			break;
		case 9:
		case 10:
			System.out.println("excellent");
			break;
		}

	}
}