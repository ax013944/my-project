package com.well.oo;

public class Student {
	int Math;
	int English;
	int Chinese;
String name;
	public Student(String n,int c,int m,int e){
		name = n;
		Chinese = c;
		Math = m;
		English = e;
		
	} 
	public void print(){
		System.out.println(Chinese+"\t"+Math+"\t"+English);
		
	}	

	public int getaverage() {
		return (English + Math + Chinese) / 3;
	}
}
