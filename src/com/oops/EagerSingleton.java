package com.oops;

public class EagerSingleton {
   
	// constructor 
	 private EagerSingleton()
	 {
		// default constructor 
	 }
	 
	private static final EagerSingleton instance = new EagerSingleton();
	 
	  static final EagerSingleton getInstance()
	 {
		 return instance;
	 }
}
