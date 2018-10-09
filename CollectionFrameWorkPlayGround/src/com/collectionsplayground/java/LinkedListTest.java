package com.collectionsplayground.java;

import java.util.LinkedList;

import com.utils.P;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++)
		P.p((int)(Math.random()*100)+" ");
		
		P.pn("");
		
		LinkedList<Double> ll = new LinkedList<>();
		
		for(int i=0;i<4;i++)
			ll.add(Math.random()*100);
	
		for(int i=0;i<4;i++)
			P.p(ll.get(i)+" ");

}
}
