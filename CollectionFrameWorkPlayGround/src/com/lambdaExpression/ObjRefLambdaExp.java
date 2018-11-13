package com.lambdaExpression;

interface ObjrefFuncInt<T> {
	boolean perform(T val);
}

class ObjMethod<T extends Number>{
	T val;
	public ObjMethod(T val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	public boolean addition(T newval){
		return val.equals(newval);
	}
}

class PerformObjRef {
	public static <T> boolean executeLogic(ObjrefFuncInt<T> of, T val){
		return of.perform(val);
	}
}

public class ObjRefLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjMethod<Integer> iob = new ObjMethod<>(5);
		
		System.out.println(PerformObjRef.executeLogic(iob::addition, 5));
		
		ObjMethod<Float> fob = new ObjMethod<>(3.0f);
		
		System.out.println(PerformObjRef.executeLogic(fob::addition, 3.0f));
	}

}
