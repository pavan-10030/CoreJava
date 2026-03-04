
/**
 * Type Promotion in Method Overloading
 * 
 * Type promotion is the process of converting a smaller datatype into a larger datatype
 */


/**
 * Inbuilt methods example for method overloading are:
 * 1.System.out.print()
 * 2.System.out.println()
 * 3.substring()
 * 4.System.out.printf()
 */

/**
 * Implementation of type promotion in method overloading
 */

class Rectangle{
	
	
	double area(double length,double breadth) {
		
		return length*breadth;
	}
	
	double area(int length,double breadth) {
		return length*breadth;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		System.out.println(r.area(10,20));

	}

}


