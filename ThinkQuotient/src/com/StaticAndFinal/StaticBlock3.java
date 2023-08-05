package com.StaticAndFinal;

public class StaticBlock3 {
	int x=100;
	static int y=200;
	
	
	
	void print()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	
	static void  print1()
	{
		//System.out.println(x);
		System.out.println(y);
	}



	public static void main(String[] args) {
		StaticBlock3.print1();
		StaticBlock3 d=new StaticBlock3();
		d.print();


	}

}
