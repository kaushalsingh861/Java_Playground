package com.collectionsplayground.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("one",0);
		
		System.out.println(hm.get("one"));
		
		if(hm.containsKey("one")){
		int val = hm.get("one");
		val++;
		hm.put("one", val);
		}
		
		hm.put("two", 2);
		
		System.out.println(hm.get("one"));
		int total =0;
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		for(Map.Entry<String, Integer> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			total = total+ me.getValue();
			}
		System.out.println(total);
		

	}

}
