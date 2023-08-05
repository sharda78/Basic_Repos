package com.ThisSuperKeyword;

public class ThisUse1 {
	public ThisUse1()
	{
		this("Test");
		System.out.println("Default");
	
	}
	public ThisUse1(String s)
	{
		this(10,"str");
		System.out.println(s);
	}
	public ThisUse1(int x,String str)
	{
		System.out.println(x + " " + str);
	}


	public static void main(String[] args) {
		ThisUse1 t1=new ThisUse1();
		//ThisUse1 t=new ThisUse1("Test");


	}

}
