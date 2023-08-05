package com.KalyaniMam_Code;

class CarInfo
{
	String name;
	int model_no;
	String color;
	float price;
	
	public void initilize(String n,int m,String c,float p)
	{
		name = n;
		model_no = m;
		color = c;
		price = p;
	}
	public void showcar()
	{
		System.out.println(name + " " + model_no + " " + color + " " + price);
	}
}
public class Car {
	

	public static void main(String[] args) {
		CarInfo ci = new CarInfo();
		ci.initilize("BMW", 300, "White", 250000.0f);
		ci.showcar();
	}

}
