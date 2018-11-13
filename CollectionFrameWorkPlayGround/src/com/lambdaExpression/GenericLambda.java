package com.lambdaExpression;

interface SomeFunc<T>{
	T perform(T o);
}

public class GenericLambda {
	public static void main(String args[]){
		SomeFunc<String> sf ;
		sf = (a)->{
			return a.toUpperCase();
		};
		System.out.println(sf.perform("smallcase"));
		
		SomeFunc<Integer> snf ;
		snf = (num)->{
			int res = num;
			for(int i=num-1;i>=1; i--){
				res =res*i;
			}
			return res;
		};
		
		System.out.println(snf.perform(5));
	}
}
