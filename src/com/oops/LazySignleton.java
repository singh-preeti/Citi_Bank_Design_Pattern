package com.oops;

public class LazySignleton {
	 private LazySignleton()
	 {
		// default constructor 
	 }
	 
	private static LazySignleton instance;
	
	static LazySignleton getInstance()
	{
		if(instance == null) {
			return instance = new LazySignleton();
		}
		else {
			return instance;
		}
	}
}
