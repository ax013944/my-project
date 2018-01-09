package com.well.sogo;

public class silverCustomer extends customer {
	public silverCustomer(int amount) {
		super(amount);
		super.discount = 0.1f;
	}
}