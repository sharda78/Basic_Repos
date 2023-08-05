package com.StaticAndFinal;

public class StaticBlock2 {
static int counter=0;
	
	StaticBlock2()
	{
		counter++;
	}


	public static void main(String[] args) {
		StaticBlock2 s=new StaticBlock2();
		System.out.println(s.counter);
		StaticBlock2 s1=new StaticBlock2();
		System.out.println(s1.counter);


	}

}
