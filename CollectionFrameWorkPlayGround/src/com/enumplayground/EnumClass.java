package com.enumplayground;

import com.utils.P;

enum DecisionTree{
	Yes,Maybe,Whatever,love,hate
}

enum Articles {
	Book,Fruits,Shelves,Racks;
	
	int val;
	int count;
	
	Articles(){
		val=-1;
		count=-1;
		P.pn("Constructor called");
	}
	
	Articles(int val,int count){
		this.val=val;
		this.count=count;
	}
	
	int getVal(){
		return val;
	}
	
	void setVal(int val){
		this.val=val;
	}
}

public class EnumClass extends P{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionTree d ;
		d = DecisionTree.hate;
		pn(d);
		Articles a;
		pn("Not yet assigned");
		a=Articles.Book;
		
		pn(a.getVal());
		Articles.Book.setVal(4);
		
		a.setVal(5);
		Articles b=Articles.Book;
		
		pn(a.getVal());
		pn(b.getVal());
		
		pn(Articles.valueOf("Book"));
		pn(a.ordinal());
		
	}

}
