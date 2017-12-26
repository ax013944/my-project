package com.ibm;

public class NineLazy {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i / 4 != 0 && i != 9) {
				for(int w=2;w<10;w++){
				System.out.print("....   ");}
			} else {
				for (int a = 2; a < 10; a++) {
					if (a * i < 10) {
						System.out.print(a + "*" + i + "= " + a * i + " ");
					} else {
						System.out.print(a + "*" + i + "=" + a * i + " ");
					}
				}
			}
			System.out.println();
		}
		
	}
}
