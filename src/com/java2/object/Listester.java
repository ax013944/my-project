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
		//remove�O���w�R��
		System.out.println(cards.size());
		//�d�j�p
		System.out.println(cards.get(1));
		//�o��ĴX�Ӫ���
		
		
		List<Integer> card = new ArrayList<>();
		for(int i=1;i<53;i++){
			card.add(i+1);
			System.out.println(card.get(i+1));
		}
	}
}
