package com.well.oo;

import java.util.Scanner;

public class gamemap {
	
	public static void main(String[] args) {

		int pos = 0;
		int row = 3;
		int col = 5;
		int hp = 100;
		while (hp>0){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 2:
				System.out.println("�V�U");
				if(pos/col<row-1){pos=pos+col;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("��q��"+hp+"�{�b�b"+pos);
				break;
			case 4:
				System.out.println("�V��");
				if(pos%col>0){pos=pos-1;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("��q��"+hp+"�{�b�b"+pos);
				break;
			case 6:
				System.out.println("�V�k");
				if(pos%col<col-1){pos=pos+1;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("��q��"+hp+"�{�b�b"+pos);
				break;
			case 8:
				System.out.println("�V�W");
				if(pos/col>0){pos=pos-col;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("��q��"+hp+"�{�b�b"+pos);
				break;
			case 0:
				System.out.println("heal");
				if(hp<100){hp=hp+20;}
				System.out.println("��q��"+hp+"�{�b�b"+pos);
				break;
			case 5:
				System.out.println("skill");
				if(hp>1){hp=hp-(hp-1);pos=0;}
				else{hp=0;}
				System.out.println("��q��"+hp+"�{�b�b"+pos);
				break;
			}

		}
		System.out.println("Game Over!!");

	}
}