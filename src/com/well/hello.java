package com.well;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {

		person p = new person();
				p.sayhello();
        System.out.print("�п�J�A���W�r:");
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        System.out.println("�w��^��,"+line);
        System.out.println("�A�X����?");
        line=scanner.nextLine();
        int age =Integer.parseInt(line);
        System.out.println(age+"?�A�n�ѳ�");
        System.out.println(age>25);
	}
}
