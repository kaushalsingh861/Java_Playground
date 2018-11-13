package com.lambdaExpression;

class StaticMethod{
	public static int doubleval(int val){
		return 2*val;
	}
}

class StringMethod{
	public static String stringVal(String s){
		return s.toUpperCase();
	}
}

interface MethodArgLambda<T>{
	T perform(T o);
}

class ExecMethodArgLambda {
	static <T> T performLogic(MethodArgLambda<T> mal, T o){
		return mal.perform(o);
	}
}

public class StaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = ExecMethodArgLambda.performLogic(StaticMethod::doubleval, 5);
		System.out.println(val);
		
		String str = ExecMethodArgLambda.performLogic(StringMethod::stringVal, "small");
		System.out.println(str);
	}

}
