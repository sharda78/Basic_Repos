package com.Loops;

import java.util.Scanner;

public class DoWhileUsingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
System.out.println("choose any one of this := circle,tri,rect,sq");
String ch = sc.next();		
		do
		{
			System.out.println(ch);
			int r,area,b,h,l,a;
			float pi = 3.14f;
			

		if(ch.equals("circle"))
		{
			System.out.println("Enter radius:");
			 r = sc.nextInt();
			 area = (int)((float)pi *r*r);
			System.out.println("area of circle is: " + area);
		}
		else if(ch.equals("tri"))
		{
		
			System.out.println("Enter Base and Height: ");
			b=sc.nextInt();
			h=sc.nextInt();
			System.out.println("area of triangle  is: " + b*h);
		}
		else if(ch.equals("rect"))
		{
	
			System.out.println("Enter length and bridth");
			l = sc.nextInt();
			b = sc.nextInt();
			System.out.println("area of rectangle is: " + l*b);
		}
		else if(ch.equals("sq"))
		{

			System.out.println("Enter value:");
			a = sc.nextInt();
			System.out.println("area of square is: " + a*a);
		}
		else
		{
			System.out.println("Invalid");
		
		}
		}while(ch == "circle" || ch == "tri" || ch == "rect" || ch == "sq");
		sc.close();



	}

}
