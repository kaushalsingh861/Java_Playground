package com.generics.java;

import com.utils.Printer;

interface MinMax <T extends Comparable<T>>{
	T min();
	T max();
}

class ValMinMax<T extends Comparable<T>> implements MinMax<T>{
	T[] ar;
	int max;
	int min;
	
 	public ValMinMax(T[] ar) {
		
		this.ar = ar;
	}
 	
 	public void showVal(){
 		for(int i=0;i<ar.length;i++)
 			System.out.print(ar[i]+" ");
 		System.out.println("");
 	}
 	
	@Override
	public T min() {
		T min = ar[0];
		for(int i=1;i<ar.length;i++)
			if(ar[i].compareTo(min)<0)
				min=ar[i];
		return min;
	}

	@Override
	public T max() {
		T max=ar[0];
		for(int i=1;i<ar.length;i++)
			if(ar[i].compareTo(max)>0)
				max=ar[i];
		return max;
	}
	
}

public class GenericInterface {

	public static void main(String[] args) {
		
		ValMinMax<Integer> i = new ValMinMax<>(new Integer[]{1,2,3,4,5,6,0});
		i.showVal();
		Printer.println("Min in Int: "+i.min());
		Printer.println("Max in Int: "+i.max());

		ValMinMax<Double> d = new ValMinMax<>(new Double[]{1.0,2.0,3.0,4.0,5.0});
		d.showVal();
		Printer.println("Min in Double: "+d.min());
		Printer.println("Max in Double: "+d.max());
		

	}

}
