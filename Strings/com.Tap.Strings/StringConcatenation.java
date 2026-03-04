package com.Tap.Strings;

public class StringConcatenation {

	public static void main(String[] args) {
		
		/**
		 * String Concatenation in Java
		 * String concatenation can be done in java using
		 * 1.+ operator
		 * 2. using concat() method
		 */
		
		/**
		 * Method 1 : using '+' operator
		 * if two string literals are concatenated it will store in String constant pool
		 * ex : "" + ""; ----> Stored in String constant pool
		 * if any reference is involved in concatenation the result will be stored in heap area 
		 * ex : "Java" + s2; ------> stored in heap area
		 */
		String s1 = "JAVA";
		String s2 = "PYTHON";
		String s3 = "JAVA"+"PYTHON";
		String s4 = s1+s2;
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		
		/**
		 * Method 2 : using concat() method 
		 * If string concatenation is performed using concat() method the resultant string will be 
		 * always stored in heap area
		 * 
		 */
		
		String s5 = s1.concat(s2);
		System.out.println(s5);

	}

}
