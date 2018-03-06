package com.java2.object;

import java.util.ArrayList;

import com.java2.object.customer;

public class tester {
	public static void main(String[] args) {

		ArrayList<customer> customers = new ArrayList<>();
		customers.add(new customer(10000));
		for (int a = 0; a < customers.size(); a++) {
			customer c = customers.get(a);
			c.print();
		}
	}
}
