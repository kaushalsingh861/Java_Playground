package com.generics.java;

import com.utils.Printer;

interface MinMax <T extends Comparable<T>>{
	int min();
	int max();
}

class ValMinMax<T extends Comparable<T>> implements MinMax<T>{
	int[] ar;
	int max;
	int min;
	
 	public ValMinMax(int[] ar) {
		
		this.ar = ar;
	}

	@Override
	public int min() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class GenericInterface {

	public static void main(String[] args) {
		
		

	}

}
