package com.well.oo;

public class VendingMachine {

	public static void main(String[] args) {

		VendingMachine2 d1 = new VendingMachine2("a", 15);
		VendingMachine2 d2 = new VendingMachine2("b", 20);
		VendingMachine2 d3 = new VendingMachine2("c", 30);
        int i=1;
		VendingMachine2[] drinks = new VendingMachine2[10];
		drinks[0] = new VendingMachine2("a", i*15);
		drinks[1] = new VendingMachine2("b", i*20);
		drinks[2] = new VendingMachine2("c", i*30);
		
		d1.print();
		
		
	}
}