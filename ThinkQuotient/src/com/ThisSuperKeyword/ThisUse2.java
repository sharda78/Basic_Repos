package com.ThisSuperKeyword;

public class ThisUse2 
{
	int x;
	public void input(int x)
	{
		this.x=x;
	}
	public void show()
	{
		System.out.println(x);
	}



	public static void main(String[] args) {
		ThisUse2 t=new ThisUse2();
		t.input(300);
		t.show();
	


	}

}
