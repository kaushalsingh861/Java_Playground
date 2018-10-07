package com.generics.java;

import com.utils.Printer;

interface ChatApp{
	String getMsg();
	void setMsg(String msg);
}

class GenericMsg<T extends ChatApp>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void showMsg(){
		System.out.println(t.getMsg());
	}
	
	public void compareMsg(GenericMsg<?> g){
		if(t.getMsg().equals(g.getT().getMsg()))
			System.out.println("Same text both Apps");
		else
			Printer.println("different Text");
		
	}
}

class WhatsApp implements ChatApp{
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

class Hike implements ChatApp{
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

public class WildCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		GenericMsg<WhatsApp> w = new GenericMsg();
		GenericMsg<Hike> h = new GenericMsg();
		
		WhatsApp w1 = new WhatsApp();
		Hike h1 = new Hike();
		
		w1.setMsg("This is WhatsApp");
		h1.setMsg("This is Hike");
		w.setT(w1);
		h.setT(h1);
		
		w.compareMsg(h);
		
		h1.setMsg("This is WhatsApp");
		
		w.compareMsg(h);
 
	}

}
