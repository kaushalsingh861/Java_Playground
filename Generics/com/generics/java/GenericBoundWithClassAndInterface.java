package com.generics.java;

interface BusinessLogic{
	int executeLogic();
}

class FirstClass{
	protected int var1;
	protected  int var2;
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
}

class Generic<T extends FirstClass & BusinessLogic>{
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	int returnVal(){
		return t.executeLogic();
	}
}

class SubClass extends FirstClass implements BusinessLogic{
	
	public int executeLogic(){
		return var1+var2;
	}
}

class SubClass2 extends FirstClass implements BusinessLogic{

	@Override
	public int executeLogic() {
		return var1*var2;
	}
	
}

public class GenericBoundWithClassAndInterface {

	public static void main(String[] args) {
		
		
		Generic<SubClass> G= new Generic<>();
		G.setT(new SubClass());
		
		G.getT().setVar1(3);
		G.getT().setVar2(4);
		
		
		Generic<SubClass2> G2 = new Generic<>();
		
		G2.setT(new SubClass2());
		
		G2.getT().setVar1(3);
		G2.getT().setVar2(4);
		
		System.out.println(G.returnVal());
		System.out.println(G2.returnVal());
		

	}

}
