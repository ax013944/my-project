package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SimpleFilePutout {
	public static void main(String[] args) throws IOException {
		PrintStream out = new PrintStream("data.txt");
		out.write(65);
		out.print("XYZ");
		out.flush();
		out.close();
	}
}