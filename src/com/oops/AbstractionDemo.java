package com.oops;
interface Customer
{
public void displayCustomerDetails();
public void show();
  
 
}
interface Department  extends Customer
{
  public void showDepartmentDetails();
}

public class AbstractionDemo implements Department {

	@Override
	public void displayCustomerDetails() {
		
		System.out.println("Hello and show the customer details!");
	}
  public static void main(String[] args) {
	  AbstractionDemo customer = new AbstractionDemo();
	  customer.displayCustomerDetails();
	  customer.show();
}
}
