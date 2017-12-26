package com.well.oo;

public class Student {
	int Math;
	int English;
	int Chinese;
	String name;

	public Student(){
		
	}
	
	public Student(String name, int chinese, int math, int english) {
		this.name = name;
		this.Chinese = chinese;
		this.Math = math;
		this.English = english;

	}

	public Student(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(Chinese + "\t" + Math + "\t" + English);

	}

	public int getaverage() {
		return (English + Math + Chinese) / 3;
	}
}
