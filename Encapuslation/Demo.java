/**
 * -----------------Encapsulation in Java--------------------------------------
 * Encapsulation is the process of providing security and controlled access to the most important 
 * component of an object i.e data members of object
 * 
 * Security can be provided by two steps
 * 	1.by declaring data members as private
 * 	2.Providing controlled access by using public setters and public getters
 */


/**
 * Implementing encapsulation in java
 */


class BankAccount{
	
	
	private int balance;
	
	public void setData(int x)
	{
		if(x>=0) {
			
			balance = x;
		}else {
			System.out.println("Invalid Input");
		}
	}
	
	public int getData() {
		return balance;
	}
}


public class Demo {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		b.setData(20000);
		System.out.println(b.getData());
		

	}
	

}


