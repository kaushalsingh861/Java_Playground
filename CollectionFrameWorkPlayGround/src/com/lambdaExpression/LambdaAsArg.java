package com.lambdaExpression;

interface FuncInterface<T>{
	T perform(T o);
}

class ExpressLambda{
	 static <T> T executeLogic(FuncInterface<T> fi, T o){
		return fi.perform(o);
	}
}

public class LambdaAsArg {

	public static void main(String[] args) {
		
		
		
	String out = ExpressLambda.executeLogic((str)->{
			String res="";
			for(int i=0;i<=str.length()-1;i++)
			{
				if(str.charAt(i)!=' '){
					res = res + str.charAt(i);
				}
								
			}
				
			return res;
		}, "This is Awesome");
		
	System.out.println(out);
	
	int fact = ExpressLambda.executeLogic((val)->{
		int res=val;
		for(int i=val-1;i>=1;i--)
			res = res*i;
		return res;
	}, 5);
	
	System.out.println(fact);

	}

}
