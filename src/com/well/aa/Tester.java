package com.well.aa;

import com.well.oo.Student;

public class Tester {

	public static void main(String[] args) {
		Student sk = new Student ("�p��", 1, 2, 3);
		Student sk1 = new Student("�p");
		// sk.Chinese = 1;
		// sk.Math = 2;
		// sk.English = 3;
		sk.print();
		int avg = sk.getaverage();
		//System.out.println(sk.name + "����:");
		
	}
}
