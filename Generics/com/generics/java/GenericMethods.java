package com.generics.java;

import com.utils.*;

public class GenericMethods {
	
	public static <T extends Comparable<T>, V extends T> void IsIn(T t,V[] v){
		for(int i=0;i<v.length;i++)
			if(v[i].equals(t))
				{
				Printer.println("Found");
				return;
				}
		
		
				Printer.println("Not Found");
				
				
				
	}

	public static void main(String[] args) {
		Integer[] Inum= {1,2,3,4,5};
		
		IsIn(2,Inum);
		
		String[] vals = {"1","2","3","4"};
		
		
		StringVals sv= new StringVals();
		
		sv.setVals(vals);
		sv.compare("2");
		
		StringMsg msg = new StringMsg();
		
		msg.setMsg(new String[]{"2","3","4","38"});
		
		StringVals sv2 = new StringVals(msg);
		
		sv2.compare("39");

	}

}

class StringVals{
	String[] vals;
	

	public String[] getVals() {
		return vals;
	}

	public void setVals(String[] vals) {
		this.vals = vals;
	}
	
	public void compare(String s){
		GenericMethods.IsIn(s, vals);
	}
	
	<T extends GetStringVal> StringVals(T t){
		vals = t.getString();
	}
	
	StringVals(){
		return;
	}
	
}

interface GetStringVal{
	String[] getString();
}

class StringMsg implements GetStringVal{
	String[] msg;
	
	
	public void setMsg(String[] msg) {
		this.msg = msg;
	}


	@Override
	public String[] getString() {
		// TODO Auto-generated method stub
		return msg;
	}
	
	
}
