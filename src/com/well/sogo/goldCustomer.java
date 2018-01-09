package com.well.sogo;

public class goldCustomer extends customer {
    int returnmoney;
	public goldCustomer(int amount) {
		super(amount);
		super.discount = 0.1f;}
@Override
	public void print() {
		int total = (int) (amount * (1 - discount));
		returnmoney = (int)(amount*discount);
		System.out.println(amount + "\t" + total+"\t"+returnmoney);

	}
}
