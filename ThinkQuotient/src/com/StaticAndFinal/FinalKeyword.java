package com.StaticAndFinal;
/*local variable cannot final
-----------------------------------------------
final keyword use for security purpose.
-----------------------------------------------
if any value is not assigned it is called as blank final variable.
-----------------------------------------------
once we declared variable as a final soo we cannot change value.
---------------------------------------------------
when a variable is declared as final ,its value can not be 
  changed once it has been initialized constant variable
  
  final variable must be initialized either at the time of declaration
  or in the constructor of the class or in iib
  note:if you have more than one constructor ,must assign final 
  variable value in all of them
  
  if any value is not assigned it is called as blank final variable
  
  we can use static keyword with final variable
  if value is not initialize it can be assigned in static block
  -----------------------------------------------------------
  if any class is final ,can not extends that class
  
  -----------------------------------------------------------
  if method is final can not override that method
  --------------------------------------------
  we can use final to ref variable also
  if final variable is a ref ,so this variable can not assign or bound to
  another class

*/


final class Employee
{
	
}

//class Manager extends Employee // we cannot extends the final class
//{
//	
//}
	


public class FinalKeyword {

	final int v = 20;
	final  int num;
	final static int x;
	// we can use static keyword with final variable
	static
	{
		x=90;
	}
	static
	{
		// x = 80;  //we cannot reassign 
	}
	
	//instance initializer block
//	{
//		num = 34;
//	}
	public FinalKeyword()
	{
		num = 300;
	}
	public FinalKeyword(String str)
	{
		num = 345;
	}
	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println("Value od a: " + a);
		final int b;
		b=100;
		//b++;  // cannot change value for final keyword
		System.out.println("Value of b: " + b);
		
		int c = a + b;
		System.out.println("Addition of a and final variable b: " + c);
		
		FinalKeyword f = new FinalKeyword();
		System.out.println("Final instance variable: " + f.v);

	}

}
