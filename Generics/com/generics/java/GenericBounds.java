package com.generics.java;


interface Feature{
	String getMessage();
	void setMessage(String[] msg);	
}

class GetMessage<T extends Feature>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	String getMessage(){
		return t.getMessage();
	}
	
	void showMessage(){
		System.out.println(t.getMessage());
	}
}

class MapsApp implements Feature {
	String msg[];
	int location=0;
	
	public String getMessage(){
		return msg[location];
	}
	
	public void setMessage(String[] msg){
		this.msg=msg;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	
}

class LogApp implements Feature{
	String msg[];
	int timestamp=0;
	
	@Override
	public String getMessage() {
		
		return msg[timestamp];
	}
	@Override
	public void setMessage(String[] msg) {
		// TODO Auto-generated method stub
		this.msg=msg;
		
	}
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	
	
}


public class GenericBounds {

	public static void main(String[] args) {
		
		String[] LocMsgs = {"Doherty", "Las Venturas", "San Fierro", "Delhi"};
		String[] LogMsgs = {"Error", "Success", "Paused", "Running", "Shutdown Initiated"};
		
		MapsApp m = new MapsApp();
		m.setMessage(LocMsgs);
		LogApp l = new LogApp();
		l.setMessage(LogMsgs);
		
		GetMessage<MapsApp> mgm = new GetMessage<>();
		GetMessage<LogApp> lgm = new GetMessage<>();
		
		mgm.setT(m);
		lgm.setT(l);
		
		mgm.showMessage();
		
		m.setLocation(1);
		
		mgm.showMessage();
		lgm.showMessage();
		l.setTimestamp(2);
		lgm.showMessage();
		
		String s = lgm.getMessage();
		
		System.out.println(s);
		
		
		
		

	}

}
