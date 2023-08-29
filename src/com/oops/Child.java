package com.oops;

public class Child  {
  
	public int div(int a,int b)
	   {
		   int c= a/b;
		   System.out.println(c);
		   return c;
	   }
	public int mult(int a,int b)
	   {
		   int c= a*b;
		   System.out.println(c);
		   return c;
	   }
	public static void main(String[] args) {
		Child childObj = new Child();
		childObj.add(10, 10);
		childObj.sub(20, 10);
		childObj.div(20, 2);
		childObj.mult(2, 2);
		childObj.modulus(20, 20);
		
		Parent parObj = new Parent();
		parObj.add(10, 20);
		parObj.sub(20, 10);
		
		}
}
