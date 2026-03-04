package com.Tap.Strings;

public class StringComparision {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = new String("JAVA");
		char[] c = {'J','A','V','A'};
		String s3 = new String(c);
		/**
		 * Different ways to compare strings in java
		 */
		
		/**
		 * Method 1 : using '==' operator
		 * Strings are compared based on reference;
		 */
		System.out.println("Using == operator");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		/**
		 * Method 2 : using 'equals()' method
		 * Strings are compared based on values
		 */
		System.out.println("Using equals() method");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		/**
		 * Method 3 : using compareTo() method
		 * Strings are compared character by character based on their UNICODE value
		 * Let the strings be s1 and s2
		 * If s1 and s2 are equal it returns 0
		 * If s1 is less than s2 it returns a negative value
		 * If s1 is greater than s2 it returns positive value
		 */
		String s4 = "SACHIN";
		String s5 = "SAURAV";
		int res = s4.compareTo(s5);
		System.out.println('C'-'U');
		System.out.println(res);
		if(res==0) {
			System.out.println("Both strings s4 and s5 are equal");
		}else if(res<0) {
			System.out.println("s4 is less than s5");
		}else{
			System.out.println("s5 is greater than s4");
		}
		
		
		/**
		 * Method 4 : using equalsIgnoreCase() method
		 * strings are compared by ignoring their case
 		 */
		
		String s6 = "Java";
		System.out.println(s1.equalsIgnoreCase(s6));
		
	}

}
