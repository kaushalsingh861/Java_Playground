package com.lambdaExpression;

interface MyFunc<T>{
	boolean perform(T t1,T t2);
}

class Temp{
	int Htemp;
	public Temp(int Htemp) {
		// TODO Auto-generated constructor stub
		this.Htemp=Htemp;
	}
	public boolean sameTemp(Temp h1)
	{
		return Htemp==h1.Htemp;
	}
	
	public boolean lessThanTemp(Temp h1){
		return Htemp<h1.Htemp;
	}
	
	public boolean greaterThanTemp(Temp h1){
		return Htemp>h1.Htemp;
	}
}

class RunFunc<T>{
	T v[];
	
	public RunFunc(T v[]){
		this.v=v;
	}	
	
	
	public int counter(MyFunc<T> mf, T t){
		int count = 0;
		for(int i=0;i<v.length;i++){
			if(mf.perform(v[i], t))
				count++;
			
			
		}
		return count;
	}
}

public class InstMethRef{
	public static void main(String args[]){
		
		Temp[] t = {new Temp(10),new Temp(11),new Temp(21),new Temp(15),new Temp(9),new Temp(8),new Temp(7)};
		
		RunFunc<Temp> rf = new RunFunc<>(t);
		
		Temp lowtemp = new Temp(10);
		int equal = rf.counter(Temp::sameTemp, lowtemp);
		System.out.println(equal);
		
		Temp midTemp = new Temp(14);
		int count = rf.counter(Temp::lessThanTemp, midTemp);
		System.out.println(count);
		
		count = rf.counter(Temp::greaterThanTemp, midTemp);
		System.out.println(count);
	}
}