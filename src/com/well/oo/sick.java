package com.well.oo;

import java.util.Scanner;

public class sick {
	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int c = 30;
		int cash = 0;
		boolean power = true;
		System.out.println("�{�b�l�B:"+cash+"��");
		while (power) {
			Scanner sc = new Scanner(System.in);
		String n = sc.next();
			
			switch (n) {
			case "1":
				cash = cash + 1;
				System.out.println("�{�b�l�B:"+cash+"��");
				break;
			case "5":
				cash = cash + 5;
				System.out.println("�{�b�l�B:"+cash+"��");
				break;
			case "10":
				cash = cash + 10;
				System.out.println("�{�b�l�B:"+cash+"��");
				break;
			case "a":
				if(cash>=a){
				cash = cash-a;
				System.out.println("DON!");
				System.out.println("�{�b�l�B:"+cash+"��");}
				break;
			case "b":
				if(cash>=b){
				cash = cash-b;
				System.out.println("DON!");
				System.out.println("�{�b�l�B:"+cash+"��");}
				break;
			case "c":
				if(cash>=c){
				cash = cash-c;
				System.out.println("DON!");
				System.out.println("�{�b�l�B:"+cash+"��");}
				break;
			case "0":
				System.out.println("BEEP!");
				power= false;
				break;
			}
			
		}
	}
}