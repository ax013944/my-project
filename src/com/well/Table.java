package com.well;

public class Table {

	public static void main(String[] args) {
	int scores[][] = new int[5][3];
	scores[0][0] =1;
	scores[0][1] =2;
	scores[0][2] =3;
	scores[1][0] =4;
	scores[1][1] =5;
	scores[1][2] =6;
	scores[2][0] =7;
	scores[2][1] =8;
	scores[2][2] =9;
	scores[3][0] =10;
	scores[3][1] =11;
	scores[3][2] =12;
	scores[4][0] =13;
	scores[4][1] =14;
	scores[4][2] =15;
for(int i=0;i<5;i++){
	System.out.print(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t");

int r =((scores[i][0]+scores[i][1]+scores[i][2])/3);
if(r <60)
{System.out.println(r+"*");}
else
{System.out.println(r);}



}	
	
	
	
	
	
	}

}
