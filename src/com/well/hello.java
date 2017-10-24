package com.well;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {

		person p = new person();
				p.sayhello();
        System.out.print("請輸入你的名字:");
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        System.out.println("歡迎回來,"+line);
        System.out.println("你幾歲阿?");
        line=scanner.nextLine();
        int age =Integer.parseInt(line);
        System.out.println(age+"?你好老喔");
        System.out.println(age>25);
	}
}
