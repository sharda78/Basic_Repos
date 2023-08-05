package com.StaticAndFinal;

class Os
{
	public void show()
	{
		System.out.println("show method");
	}
	public final void display()
	{
		System.out.println("final method in parent class os");
	}
}
class Windows extends Os
{
	public void show()
	{
		System.out.println("show method");
	}
//	public final void display()           // cannot override final method
//	{
//		System.out.println("final method in parent class os");
//	}
}
public class TestFinal {

	public static void main(String[] args) {
		
Windows w = new Windows();
w.show();
w.display();
	}

}
