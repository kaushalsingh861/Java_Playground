package com.inheritence;

class parent{
	parent(){
		System.out.println("Parent Object Is created");
	}
}

class child extends parent{
	child(){
		System.out.println("Now Child is created");
	}
}

public class InheritenceTest {
	public static void main(String arg[]){
		child c = new child();
		
	}

}
