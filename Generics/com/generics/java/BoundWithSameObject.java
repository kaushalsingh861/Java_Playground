package com.generics.java;

class BoundingClass{
	int v;

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
	public void showVal(){
		com.utils.Printer.println("the value of v is "+v);
	}
}

class GenericBound<T extends BoundingClass>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundWithSameObject {

	public static void main(String[] args) {
		
		GenericBound<BoundingClass> G = new GenericBound<>();
		
		G.setT(new BoundingClass());
		G.getT().setV(4);
		G.getT().showVal();
	}

}
