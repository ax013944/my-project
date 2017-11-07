package com.well;

public class prime {

	public static void main(String[] args) {
	for(int i=2;i<1000;i++){
	boolean prime =true;
	for(int a=2;a<i;a++){
		if(i%a==0){
		
	prime=false;break;}
	}
	if(prime){System.out.print(i+"\t");}
	}
}}
