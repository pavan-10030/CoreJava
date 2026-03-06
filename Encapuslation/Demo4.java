package com.Tap.Encapsulation;

/**
 * ------------------------------Constructor Overloading---------------------------------
 * Creating multiple constructors within the class with different parameters is called constructor overloading 
 */
class Employee{
	
	private int id;
	private String name;
	private int salary;
	
	
	//	zero parameterized constructor
	public Employee()
	{
		this.id=1;
		this.name="rohit";
		this.salary=30000;
	}
	
	
	// parameterized constructor
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSalary() 
	{
		return this.salary;
	}
}





public class Demo4 {
	public static void main(String args[]) {
		
		Employee e1 = new Employee();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		Employee e2 = new Employee(2,"David",25000);
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		
				
	}
}
