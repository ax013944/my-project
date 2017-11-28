package com.well;

import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		int n[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入天數:");
		String line = scanner.nextLine();
		int f = Integer.parseInt(line);
		for (int a = 0; a < 12; a++) {
			if (f <= n[a]) {
				System.out.println((a + 1) + "/" + f);
				break;
			} else {
				f = f - n[a];
			}
		}

		int p[] = { 2, 5, 4, 3, 1 };
		for (int y = 0; y < p.length; y++) {
			for (int l = 0; l < p.length; l++) {
				if (p[l] > p[l + 1]) {
					int bac = p[l];
					p[l] = p[l + 1];
					p[l + 1] = bac;
				}
			}
		}

		int s = 2;
		int w = 200;
		int tmp = s;
		s = w;
		w = tmp;
		System.out.println(s);
		System.out.println(w);
	}
}