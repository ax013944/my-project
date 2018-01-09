package com.well.sogo;

import java.util.ArrayList;

public class Testers {

	public static void main(String[] args) {

		ArrayList<customer> customers = new ArrayList<>();
		customers.add(new customer(10000));
		customers.add(new silverCustomer(10000));
		customers.add(new goldCustomer(10000));
		for(int a=0;a<customers.size();a++){
			customer c = customers.get(a);
			c.print();
		}
		
		
		
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(94);
		list.add(87);
		list.add(55);
		int p = (int) list.get(2);
		
		System.out.println(list.get(2));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
