package com.ThisSuperKeyword;

public class ThisUse3 
{
	public void foo()
	{
		this.show();
		System.out.println("HIi java");
		
		
	}
	public void show()
	{
		System.out.println("Student");
	}

	public static void main(String[] args) {
		ThisUse3 t=new ThisUse3();
		t.foo();
		//t.show();

	}



}
