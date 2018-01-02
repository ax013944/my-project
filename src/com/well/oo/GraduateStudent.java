package com.well.oo;

public class GraduateStudent extends Student{
public GraduateStudent(){
	super();
System.out.print("hahaha");

}
	int gstu=1;
	@Override
	public int  getaverage(){
		return (English + Math + Chinese)/4;
		
}
	@Override
	public void print() {
		System.out.println(Chinese + "\t" + Math + "\t" + gstu);

	}
	
}
