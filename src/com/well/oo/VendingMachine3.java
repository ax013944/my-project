package com.well.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine3 {
	List<drink> drinks = new ArrayList<>();

	public void on() {
		int totals = 0;
		for (int i = 0; i < drinks.size(); i++) {
			drink drinker = drinks.get(i);
			System.out.println(drinker.getId() + "\t" + drinker.getName() + "\t" + drinker.getPrice());
		}
		Scanner scl = new Scanner(System.in);
		int data = -1;
		System.out.println("�Ч�J���׺׮�0�������");
		while (data != 0) {
			System.out.println("�ثe�l�B:" + totals + "��");
			data = scl.nextInt();
			switch (data) {
			case 0:
				data = 0;
				System.out.println("�������");
				break;
			case 5:
				totals = totals + 5;
				break;
			case 10:
				totals = totals + 10;
				break;
			case 50:
				totals = totals + 50;
				break;
			case 1000:
				totals = totals + 1000;
				break;
			case 100:
				totals = totals + 100;
				break;
			default:
				System.out.println("���¡A���[��");
				break;
			}
		}
		System.out.println("�п�ܶ���");
		for (int i = 0; i < drinks.size(); i++) {
			drink drinker = drinks.get(i);
			System.out.println(drinker.getId() + "\t" + drinker.getName() + "\t" + drinker.getPrice());
		}
		while (totals != 0) {

			System.out.println("�Ѿl:" + totals + "��");
			int d = scl.nextInt();
			switch (d) {
			case 1:
				if (totals < 100) {
					System.out.println("�l�B����");
				} else {
					totals = totals - 100;
					System.out.println("done!");
				}
				break;
			case 2:
				if (totals < 999) {
					System.out.println("�l�B����");
				} else {
					totals = totals - 999;
					System.out.println("done!");
				}
				break;
			case 3:
				if (totals < 75) {
					System.out.println("�l�B����");
				} else {
					totals = totals - 75;
					System.out.println("done!");
				}
				break;
			case 0:
				System.out.println("Thanks");
				System.out.println("�Ѿl�h���B:" + totals + "��");
				totals = 0;
				break;
			default:
				System.out.println("�Э��I�A���M�O��");
				break;
			}
		}
	}
}
