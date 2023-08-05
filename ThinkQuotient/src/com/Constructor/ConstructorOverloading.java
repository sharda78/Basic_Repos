package com.Constructor;
class Employee {
	String name;
	// public Employee()
	// {
	// System.out.println("hiiiii");
	// }
	// public Employee(String name)
	// {
	// System.out.println("name="+name);
	// }
	// public int add()
	// {
	// return 1+2;
	// }
	
	//cannot convert int into long cause of it's size

	public void foo(long x) {
		System.out.println("int");
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// Employee emp=new Employee("amit");
				// int ans=emp.add();

				Employee emp = new Employee();

				int a = 100;
				emp.foo(a);


	}

}
