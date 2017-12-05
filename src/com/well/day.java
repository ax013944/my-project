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
			for (int l=y+1; l < p.length; l++) {
				if (p[y] > p[l]) {
					int bac = p[y];
					p[y] = p[l];
					p[l] = bac;
				}
			}
		}
		for(int num :p){
			System.out.print(num+" ");
		}
		
	}
}