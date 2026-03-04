/**
 * Method Overloading in Java
 * Creating multiple methods with same name inside a class with different parameters
 * Method overloading is also knows as compile time polymorphism , static binding and early binding
 * 
 * Methods have same names but different in :
 * 1.Number of parameters
 * 2.Data types of parameters
 * 3.Order of parameters
 * 4.Implicit type casting or type promotion
 * 
 * 
 * If two methods have same name and same number of parameters and type of parameters but different return 
 * values , it will lead to an error
 * 
 */


/**
 * Implementation of method overloading 
 */

class Calculator{
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	float add(int a,float b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		System.out.println(c.add(2, 4));
		System.out.println(c.add(4,6.0f));
		System.out.println(c.add(1, 2,6));

	}

}
