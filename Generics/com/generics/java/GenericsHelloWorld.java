package com.generics.java;

class Box<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

class Shape {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}

class Use{
	private Box<Shape> obj ;
	private Shape mat1 ;
	
	public void setVal(){
		
		obj  = new Box<>();
		mat1 = new Shape();
		
		mat1.setStr("This is a Rectangle");
		obj.setT(mat1);
		
	}
	
	public void getVal(){
		
		System.out.println(mat1.getStr());
		
		mat1.setStr("this is circle now");
		
		System.out.println(obj.getT().getStr());
	}
	
}

public class GenericsHelloWorld {

	
	public static void main(String args[]){
		Use u=new Use();
		u.setVal();
		u.getVal();
	}
	
}
