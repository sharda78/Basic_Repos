package com.Constructor;

public class ConstructorDemo {
	//Instance block is way to share code between constructors and it
	//make code more readable if it is used with variable declaration.
		 static int count = 0;
		 {
			 count++;
		 }
		 ConstructorDemo()
		 {
			 
		 }
		 ConstructorDemo(int a)
		 {
			
		 }
		 void get_count()
		 {
			 System.out.println(count);
		 }
		 


		public static void main(String[] args) {
			
			ConstructorDemo i=new ConstructorDemo();
			i.get_count();
			ConstructorDemo i1=new ConstructorDemo(10);
			i1.get_count();
			

		}
	}

