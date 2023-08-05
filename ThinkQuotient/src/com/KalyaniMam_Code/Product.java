package com.KalyaniMam_Code;

public class Product {
	int product_id;
	String name;
	public Product()
	{
		System.out.println("Default");
		product_id=100;
		name = "mouse";
		
	}
	public Product(String name)
	{
		System.out.println("Product name= "+name);	
	}
	


	public static void main(String[] args) {
	
		Product p=new Product();
		System.out.println(p.product_id + " " + p.name);
	Product p2=new Product("PenDrive");


	}

}
