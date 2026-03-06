package com.Tap.Encapsulation;


/**
 * -------------------------Setters and Getters----------------------------------------
 * setter is a public method which sets the value of data members
 * getter is a public method which gets the value of data members.getter method is also known as accessor
 */


/**
 * ------------------Implementation of setters and getters------------------------------
 */
class Customer{
	
	
	//private data members
	private int id;
	private String name;
	private long num;
	
	//setter to set id
	public void setId(int id) {
		this.id=id;
	}
	
	//setter to set name
	public void setName(String name) {
		this.name=name;
	}
	
	//setter to set num
	public void setNum(long num) {
		this.num=num;
	}
	
	
	//getter to get id
	public int getId() {
		return this.id;
	}
	
	//getter to get name
	public String getName() {
		return this.name;
	}
	
	//getter to get num
	public long getNum()
	{
		return this.num;
	}
}



public class Demo2 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("John");
		c1.setNum(123456789);
		System.out.println("Customer Details:");
		System.out.println("Id : "+c1.getId()+" Name: "+c1.getName()+" Number: "+c1.getNum());

	}

}
