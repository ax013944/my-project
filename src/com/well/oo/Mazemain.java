package com.well.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Mazemain {

	public static void main(String[] args) {
		FileReader fr;
		try{
			fr=new FileReader("maze.txt");
			BufferedReader in=new BufferedReader(fr);
			String line=in.readLine();
			String[] token =line.split(",");
			int col =Integer.parseInt(token[0]);
			int row =Integer.parseInt(token[0]);
			line= in.readLine();
			int trapcount =Integer.parseInt(line);
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
		class Ma {
			int row, col;
			int trapcount;
			int[] traps;
			Player player;

			public Ma(int row, int col, int trapcount) {
				this.col = col;
				this.row = row;
				this.trapcount = trapcount;
			}
		}
			class Player {
				int hp = 100;
				int pos = 0;		
}
}