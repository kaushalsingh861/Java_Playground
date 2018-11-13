package com.lambdaExpression;

interface MyNumber {
	double getNum();
}

public class BasicSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNum ;
		myNum = ()-> 127.3;
		System.out.println(myNum.getNum());
		
		myNum = ()->Math.random()*100;
		System.out.println(myNum.getNum());
		
	}

}
