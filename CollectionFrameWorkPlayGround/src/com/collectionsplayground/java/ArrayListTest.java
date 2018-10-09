package com.collectionsplayground.java;

import java.util.ArrayList;

import com.utils.P;

class gen1<T extends Number>{
	 T t;

	 gen1(T t){
		 this.t=t;
	 }
	 
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	 
}

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<gen1<Integer>> ar = new ArrayList<>();
		
		ar.add(new gen1<Integer>(2));
		ar.add(new gen1<Integer>(1));
		
		P.pn(ar.size());
		
		ar.add(2,new gen1<Integer>(4));
		ar.add(new gen1<Integer>(3));
		
		P.pn(ar.size());
		
		gen1<Integer> g1 = ar.get(2);
		
		int num = g1.getT();
		
		P.pn(num);
		
		for(int i = (ar.size()-1) ;i>=0 ; i--)
		P.pn(ar.get(i).getT());
		
		
		
		
	}

}
