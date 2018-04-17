package com.java2.io;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.List;

import com.well.sogo.customer;
import com.well.sogo.goldCustomer;
import com.well.sogo.silverCustomer;
public class sogo {
	Scanner scanner = new Scanner(System.in);
	public sogo() {

	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showFunctions();
			function = scanner.nextInt();
			switch (function) {
			case 1:
				inputSales();
				break;
			case 2:
				List<sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader in = new BufferedReader(isr);					
					String line = in.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						//����
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							sales sales = new sales(type, amount);
							list.add(sales);
							//��X
						} catch (NumberFormatException e) {
							System.out.println("��Ʈ榡���~");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				for (sales sales: list){
					customer customer = null;
					switch(sales.type){
					case 1: 
						customer = new customer(sales.getAmount());
						break;
					case 2:
						customer = new silverCustomer(sales.getAmount());
						break;
					case 3:
						customer = new goldCustomer(sales.getAmount());
						break;
					}
					customer.print();
				}
				
				
				break;
			case 3:
				return;
			}
		}
	}

	public void inputSales() {
		try {
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.print("�п�J�|������:");
			int type = scanner.nextInt();
			System.out.print("�п�J�P����B:");
			int amount = scanner.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void showFunctions() {
		System.out.println("�п�J�\��(1~3):");
		System.out.println("1) ��J�P��O��");
		System.out.println("2) �L�X�P�����");
		System.out.println("3) �����{��");
	}

	public static void main(String[] args) {
		sogo sogo = new sogo();
		sogo.start();
	}
}