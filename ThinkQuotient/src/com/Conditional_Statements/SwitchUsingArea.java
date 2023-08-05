package com.Conditional_Statements;

import java.util.Scanner;

public class SwitchUsingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r,area,b,h,l,a;
		float pi = 3.14f;
		System.out.println("choose any one of this := circle,tri,rect,sq");
		String choise = sc.next();
		switch(choise)
		{
		case "circle":
			System.out.println("Enter radius:");
			 r = sc.nextInt();
			 area = (int)((float)pi *r*r);
			System.out.println("area of circle is: " + area);
			break;
		case "tri":
			System.out.println("Enter Base and Height: ");
			b=sc.nextInt();
			h=sc.nextInt();
			System.out.println("area of triangle  is: " + b*h);
			break;
		case "rect":
			System.out.println("Enter length and bridth");
			l = sc.nextInt();
			b = sc.nextInt();
			System.out.println("area of rectangle is: " + l*b);
			break;
		case "sq":
			System.out.println("Enter value:");
			a = sc.nextInt();
			System.out.println("area of square is: " + a*a);
			break;
		

		}
		sc.close();



	}

}
