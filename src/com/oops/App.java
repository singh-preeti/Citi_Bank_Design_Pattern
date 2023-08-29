package com.oops;

public class App {
  public static void main(String[] args) {
	  
	  EagerSingleton obj1 = EagerSingleton.getInstance();
	  System.out.println(obj1.hashCode());
	  
	  EagerSingleton obj2 = EagerSingleton.getInstance();
	  System.out.println(obj2.hashCode());
	  
	  
	  LazySignleton obj3 = LazySignleton.getInstance();
	  System.out.println(obj3.hashCode());
	  
	  LazySignleton obj4 = LazySignleton.getInstance();
	  System.out.println(obj4.hashCode());
}
}
