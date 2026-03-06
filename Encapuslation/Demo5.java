package com.Tap.Encapsulation;


/**
 * -----------------------------Constructor Chaining------------------------------
 * Constructor chaining is a process where one constructor calls another constructor 
 * This can be achieved in two ways :
 * 	1.Local chaining
 * 	2.Class child to parent child
 * 
 * 
 * Local Chaining:
 * 	Constructor calls another constructor within same class
 * 	It can be achieved using this() method.
 */




/**
 * -----------------------Constructor Chaining Implementation--------------------------------
 */


class Consumer{
	
	private int id;
	private String name;
	private String location;
	
	public Consumer() 
	{
		
		this.id=1;
		this.name="John";
		this.location="Bangalore";
	}
	
	public Consumer(int id,String name, String location)
	{
		this(); //Local chaining
	}
	
	
	public int getId()
	{
		return this.id;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getLocation()
	{
		return this.location;
	}
}




public class Demo5 {

	public static void main(String[] args) {
		
		Consumer c = new Consumer(2,"Steve","Mumbai");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getLocation());

	}

}
