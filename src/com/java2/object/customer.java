package com.java2.object;

public class customer {

	int amount;
	float discount = 0.10f;

	public customer(int amount) {
		this.amount = amount;
	}

	public void print() {
		int total = (int) (amount * (1 - discount));
		System.out.println("���"+amount + "��"+"\t" +"�@��|���S��"+ total+"��");

	}
}
