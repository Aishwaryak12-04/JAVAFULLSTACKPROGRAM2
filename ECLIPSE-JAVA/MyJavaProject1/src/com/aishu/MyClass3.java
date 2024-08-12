package com.aishu;

public class MyClass3 {
   void myMethod1() {
	   System.out.println("Instance or object Method");
   }
   static void myMethod2() {
	   System.out.println("static or Class Method");
   }
   public static void main(String[]args) {
	   MyClass3 obj = new MyClass3();
	   obj.myMethod1();
	   MyClass3.myMethod2();
	   
   }
}
