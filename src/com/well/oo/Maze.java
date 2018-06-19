package com.well.oo;

import com.well.oo.Mazemap.Player;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Maze {
int hp=100;
int pos=0;
int row,col;
int trapcount;
int []traps;
Player player;
public Maze (int col,int row , int trapcount){
	this.col=col;
	this.row=row;
	this.trapcount=trapcount;
}
boolean a = true;
Random r1 = new Random();
HashSet<Integer> trap = new HashSet<>();
List<Integer> token = new ArrayList<>();
public void putTrap() {
	for (int i = 0; i < trapcount; i++) {
	trap.add(r1.nextInt(16));
}
while (trap.size() != trapcount) {
	trap.add(r1.nextInt(16));
}

Iterator<Integer> it = trap.iterator();
while (it.hasNext()) {
	Integer i = it.next();
	token.add(i);
}
}
public void start() {
	while (a) {
		System.out.println(pos + " " + hp);
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		switch (i) {
		case 8:
			if ((pos / col) > 0) {
				pos = pos - 4;
			} else {
				hp = hp - 5;
			
			}
			
			break;
		case 2:
			if ((pos / col) < 3) {
				pos = pos + 4;
			} else {
				hp = hp - 5;
			}
			
			break;
		case 4:
			if ((pos % col) > 0) {
				pos = pos - 1;
			} else {
				hp = hp - 5;
			}
			
			break;
		case 6:
			if ((pos % col) < 3) {
				pos = pos + 1;
			} else {
				hp = hp - 5;
			}
			
			break;
		case 5:
			System.out.println("attack!!");
			break;

		}
		if (pos == token.get(0) || pos == token.get(1) || pos == token.get(2)
				|| pos == token.get(3) || pos == token.get(4)) {
			hp = hp - 5;
		}
		if (i == 0 || hp <= 0) {
			System.out.println("~~GAME OVER~~");
			a = false;
		}

	}
}
}
