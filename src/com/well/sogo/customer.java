package com.well.sogo;

public class customer {
	int amount;
	float discount = 0.05f;

	public customer(int amount) {
		this.amount = amount;
	}

	public void print() {
		int total = (int) (amount * (1 - discount));
		System.out.print(amount + "/t" + total);

	}
}
