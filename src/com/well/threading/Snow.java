package com.well.threading;

import java.util.Random;

public class Snow extends Thread{
int x;
int y=800;
Random random =new Random();
public Snow(){
	x=random.nextInt(600);
}
@Override
public void run(){
for(int i=800;i>0;i--){
	System.out.println(getName()+"("+x+","+y+")");
	y=y-1;
	int move =random.nextInt(2)-1;	
	x=x-move;
	System.out.print(new String(new char[x]).replaceAll("/0"," "));


}
}
}
