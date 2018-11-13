package com.lambdaExpression;

class GenMethod{
	static <T> int countEqual(T t[], T v){
		int count=0;
		for(int i=0;i<t.length;i++){
			if(t[i]==v) 
				count++;
			
		}
		return count;
	}
}



interface GenMyFunc<T>{
	int perform(T t[],T v);
}

class GenDemo{
	static<T> int executeLogic(GenMyFunc<T> gmf, T t[], T v){
		return gmf.perform(t, v);
	}
}


public class GenericMethodRef {

	public static void main(String[] args) {
		
		String s[] = {"asdfa","awer","asdf","ddsa","asdfa","awer"};
		Integer i[] = {1,1,2,3,3,5};
		
		int count=GenDemo.executeLogic(GenMethod::<String>countEqual, s, "awer");
		System.out.println(count);
		
		count = GenDemo.<Integer>executeLogic(GenMethod::countEqual, i, 2);
		System.out.println(count);
		
	}

}
