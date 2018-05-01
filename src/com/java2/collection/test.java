package com.java2.collection;

import java.util.*;;

public class test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		System.out.println(set2);
		
		Map<String,String> stocks = new TreeMap<>(); 
		stocks.put("0001","a");
		stocks.put("0002","b");
		stocks.put("0003","c");
		stocks.put("0004","d");
		System.out.println(stocks);
	}
}
