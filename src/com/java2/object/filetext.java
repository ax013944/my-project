package com.java2.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;

public class filetext {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(56);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(404);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	write();	
	}
	
	public static void write(){
	try {
		FileOutputStream out = new FileOutputStream("data.txt");
 out.write(56);
		out.flush();
		out.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}