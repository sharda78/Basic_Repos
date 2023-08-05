package com.StaticAndFinal;

public class StaticBlock {

		public void StaticBlock()
		{
			System.out.println("Default method");
		}
		static
		{
			System.out.println("In Static Block1");
		}

		public static void main(String[] args) {
			System.out.println("main");
			StaticBlock b1=new StaticBlock();
			StaticBlock b2=new StaticBlock();
			b1.StaticBlock();
		}
		
		static
		{
			System.out.println("In Static Block2");
		}
	


	}


