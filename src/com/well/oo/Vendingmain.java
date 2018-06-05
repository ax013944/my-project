package com.well.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Vendingmain {
	public static void main(String[] args) {
		VendingMachine3 vm = new VendingMachine3();
		FileReader fr = null ;
		try {
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token = line.split(",");
			line = in.readLine();
			int count = Integer.parseInt(token[0]);
			for (int i = 0; i < count; i++) {
				String name = token[i * 2 + 1];
				int price = Integer.parseInt(token[i * 2 + 2]);
				vm.drinks.add(new drink(i + 1, name, price));
			}
			vm.on();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		// TODO: handle exception
	}


	
	}
