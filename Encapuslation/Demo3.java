package com.Tap.Encapsulation;


/**
 *  ---------------------Constructors----------------------------------------
 *  A constructor is a built in setter in java that is automatically called during object creation
 *  A constructor name should be same as class name and constructor does not have a return type
 *  Constructors are classified into two types :
 *  	1.Zero parameterized constructors
 *  	2.Parameterized constructors
 *  If a programmer does not declare any constructor in class , java compiler will automatically add the zero parameterized constructor
 *  
 */




/**
 * ---------------------------Constructor Implementation---------------------------
 */

class Student{
	
	private int age;
	private String name;
	private char grade;
	
	
	
	//parameterized constructor
	public Student(int age,String name,char grade)
	{
		this.age=age;
		this.name=name;
		this.age=age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public char getGrade()
	{
		return this.grade;
	}
}





public class Demo3 {

	public static void main(String[] args) {
		
		Student s1 = new Student(12,"John",'A');
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());
		System.out.println("Grade : "+s1.getGrade());

	}

}
