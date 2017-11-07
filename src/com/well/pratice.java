package com.well;

public class pratice {
	public static void main(String[] args) {
		for (int n = 1; n < 10; n = n + 1) {
			for (int x1 = 2; x1 < 6; x1 = x1 + 1) {
				if (x1 * n < 10) {
					System.out.print(x1 + " x " + n + " =  " + n * x1+"\t");

				} else { 
					System.out.print(x1 + " x " + n + " = " + n * x1+"\t");
				}
							}
			System.out.println();
		}
	}
}