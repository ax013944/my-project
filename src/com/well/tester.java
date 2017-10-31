package com.well;

import java.util.Random;

public class tester extends hello {

	public static void main(String[] args) {
		int age = 6;
		float weight = 12.444f;
		char c = 65;
		char c2 = 'Z';
		boolean pass = false;
		String s = new String("Hello");
		System.out.println(!pass);
		System.out.println((int) c2);
		System.out.println(s);
		System.out.println(age);
		Random r = new Random();
		int n1 = r.nextInt(6) + 1;
		System.out.println(n1);
		int n2 = r.nextInt(6) + 1;
		System.out.println(3 == 2);
		int len = s.length();
		System.out.println("len:" + len);
		System.out.println(s.charAt(1));
		String s2 = "Haaaaaaaaa";
		// 字串轉整數
		String data2 = "123";
		// 整數轉字串
		int n = Integer.parseInt(data2);
		String data = String.valueOf(n);
	}
}