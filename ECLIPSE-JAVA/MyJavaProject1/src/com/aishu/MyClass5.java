package com.aishu;

public class MyClass5 {
	
	
		MyClass(String name) {

			System.out.println("Welcome " + name);

		}

		MyClass5(int a , int b) {

			this("Aishu");

			System.out.println("Addition :" + (a+b));

		}

		MyClass5(int n) {

			this(10, 20);

			int fact = 1;

			for(int i = 1; i <=n;i++)

				fact = fact * i;

			System.out.println("Factorial :" + fact);

		}

		public static void main(String[] args) {

			MyClass5 obj1 = new MyClass5(5);

			

			

		}

	}
}
