package com.collectionsplayground.java;

import java.util.LinkedList;

import com.utils.P;


public class LinkedListTest extends P{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++)
			p((int)(Math.random()*100)+" ");
		
		pn("");
		
		LinkedList<Double> ll = new LinkedList<>();
		
		for(int i=0;i<4;i++)
			ll.add(Math.random()*100);
	
		for(int i=0;i<4;i++)
			p(ll.get(i)+" ");
		P obj =  new P();
		
		
		obj.p("Statics can be called from objects");

}
}
