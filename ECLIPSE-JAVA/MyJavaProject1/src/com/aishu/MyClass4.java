package com.aishu;

public class MyClass4 {
	String name;
	
	MyClass4(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	MyClass4(int a, int b){
		System.out.println("Sum:"+(a+b));
	}
	void greeting() {
		System.out.println("Welcome"+ name);
	}
	public static void main (String[]args) {
		MyClass4 obj = new MyClass4("Aishu");
	}

}
