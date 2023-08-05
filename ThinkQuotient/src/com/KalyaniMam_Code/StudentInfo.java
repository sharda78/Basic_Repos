package com.KalyaniMam_Code;

class Student
{
	String name;
	int roll_no;
	int id;
	int age;
	
	public void stud(String n,int r,int i,int a)
	{
		name = n;
		roll_no = r;
		id = i;
		age = a;
	}
	public void display_details()
	{
		System.out.println("Name is: " + name );
		System.out.println("Roll_No is: " + roll_no);
		System.out.println("Id is: " +id);
		System.out.println("Age is: " + age);
	}
}
public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ci = new Student();
		ci.stud("John", 30, 4, 25);
		ci.display_details();

	}

}
