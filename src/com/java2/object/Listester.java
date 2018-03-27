package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class Listester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(45);
		cards.add(1);
		cards.add(3);
		System.out.println("removing number:"+cards.remove(1));
		//remove是指定刪除
		System.out.println(cards.size());
		//查大小
		System.out.println(cards.get(1));
		//得到第幾個的值
		
		
		List<Integer> card = new ArrayList<>();
		for(int i=1;i<53;i++){
			card.add(i+1);
			System.out.println(card.get(i+1));
		}
	}
}
