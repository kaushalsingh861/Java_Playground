package com.lambdaExpression;

class SomeClass{
	int val;
	public SomeClass(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	public void getVal(){
		System.out.println(val);
	}
}

interface MyFactoryFunc{
	SomeClass factory(int val);
}



public class ConstructorLambda {

	public static void main(String[] args) {
		MyFactoryFunc mff = SomeClass::new;
		
		SomeClass sc = mff.factory(2);
		sc.getVal();

	}

}
