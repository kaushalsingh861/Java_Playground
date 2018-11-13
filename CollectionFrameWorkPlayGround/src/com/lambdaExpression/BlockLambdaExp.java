package com.lambdaExpression;

interface StringFunc{
	String perform(String a);
}

public class BlockLambdaExp {
	
	public static void main(String args[]){
		StringFunc sf = (a)->{
			String res="";
			for(int i=a.length()-1;i>=0;i--)
				res =   res + a.charAt(i) ;
			return res;
		};
		
		System.out.println(sf.perform("Last"));
		
		sf = (a)->{
			String res = "";
			res = a.toUpperCase();
			return res;
		};
		
		System.out.println(sf.perform("Last"));

		
	}
}
