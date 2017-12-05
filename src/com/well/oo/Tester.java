package com.well.oo;

public class Tester {

	public static void main(String[] args) {
		Student sk = new Student("¤p©ú",1,2,3);
	//	sk.Chinese = 1;
	//	sk.Math = 2;
	//	sk.English = 3;
		sk.print();
		int avg = sk.getaverage();
		System.out.println(sk.name+"¥­§¡:" + avg);

	}
}
