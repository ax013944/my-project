package com.well.oo;

public class VendingMachine2 {
	int price;
	String key;

	public VendingMachine2(String key, int price) {
		this.price = price;
		this.key = key;
	}
	public void print(){
		System.out.println(key+","+price);
	}
}
