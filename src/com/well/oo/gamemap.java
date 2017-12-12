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
				System.out.println("向下");
				if(pos/col<row-1){pos=pos+col;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("血量剩"+hp+"現在在"+pos);
				break;
			case 4:
				System.out.println("向左");
				if(pos%col>0){pos=pos-1;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("血量剩"+hp+"現在在"+pos);
				break;
			case 6:
				System.out.println("向右");
				if(pos%col<col-1){pos=pos+1;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("血量剩"+hp+"現在在"+pos);
				break;
			case 8:
				System.out.println("向上");
				if(pos/col>0){pos=pos-col;hp=hp-5;}
				else{hp=hp-30;}
				System.out.println("血量剩"+hp+"現在在"+pos);
				break;
			case 0:
				System.out.println("heal");
				if(hp<100){hp=hp+20;}
				System.out.println("血量剩"+hp+"現在在"+pos);
				break;
			case 5:
				System.out.println("skill");
				if(hp>1){hp=hp-(hp-1);pos=0;}
				else{hp=0;}
				System.out.println("血量剩"+hp+"現在在"+pos);
				break;
			}

		}
		System.out.println("Game Over!!");

	}
}