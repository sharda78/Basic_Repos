package com.StaticAndFinal;

public class StaticBlock1 {

	 static int count=0;
	 int x=78;
	
	StaticBlock1()
	{
		count++;
		System.out.println(count);
	}
	
	public void show()
	{
		System.out.println(count);
	}
	
	public static void access()
	{
		StaticBlock1 d=new StaticBlock1();
		System.out.println(count+" "+d.x);
	}

	public static void main(String[] args) {
	
		StaticBlock1 d1=new StaticBlock1();
			System.out.println(StaticBlock1.count);
			
			//System.out.println(x);         // we cannot acess  static variabe in non static block.
			StaticBlock1.access();
	}


	}


