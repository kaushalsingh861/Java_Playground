package com.generics.java;

import com.utils.Printer;

class GenSuperWithConstructor<T>{
	private T t;

	public GenSuperWithConstructor(T t) {		
		this.t = t;
	}
	
	public String getClas(){
		return t.getClass().toString();
	}
	
	public T getObject(){
		return t;
	}
}

class GenSuperWithoutConstructor<T>{
	
	private T t;
	
	public String getClas(){
		return t.getClass().toString();
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

class sub1<T> extends GenSuperWithConstructor<T>{
	sub1(T t){
		super(t);
	}
	 
	void showclass(){
		System.out.println(getClas());
	}
	
}

class sub2<T> extends GenSuperWithoutConstructor<T>{
	
	void showclass(){
		System.out.println(getClas());
	}
}
 


public class GenericInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub1<Integer> s1 = new sub1<>(2);
		
		Printer.println(s1.getClas());
		s1.showclass();
		
		sub2<Double> s2 = new sub2<>();
		s2.setT(3.0);
		Printer.println(s2.getClas());
		s2.showclass();
		System.out.println(s2.getT());
 		
	}

}
