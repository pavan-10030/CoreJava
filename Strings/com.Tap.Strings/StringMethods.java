package com.Tap.Strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Java Virtual Machine";
		
		/*
		 * Built in methods in strings
		 * 1.length() -- returns the length of string
		 * 2.charAt(int idx) -- returns character at the specified position
		 * 3.substring(int stIdx,int endIdx) -- returns a substring
		 * 4.indexOf(String str) -- returns the index of first occurence 
		 * 5.lastOccurence(String str) -- returns the index of last occurence
		 * 6.replace(char oldChar,char newChar) -- replaces old characters with new characters
		 * 6.toLowerCase() -- returns new string in lower case
		 * 7.toUpperCase() -- returns new string in Upper case
		 * 8.trim() -- removes all leading and trailing spaces 
		 * 9.split(regex) -- splits the string based on regular expression. 
		 * It always returns array of strings
		 */
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.substring(0,4));
		System.out.println(s.indexOf('J'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.replace('a', 'e'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String[] words = s.split(" ");
		
		

	}

}
