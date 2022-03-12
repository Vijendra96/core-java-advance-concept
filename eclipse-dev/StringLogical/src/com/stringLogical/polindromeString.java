package com.stringLogical;
//13. Write a program to check whether given string is a palindrome or not?

/*
	Algorithm
	1. Define a string s1.
	2. reverse the string .
	3. compare original string with reversed string
 */
import java.util.Scanner;

public class polindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string...");
		String s1 = sc.nextLine();
		String s2 = "";
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println(s1 + " and " + s2 + " is polindrome");
		}else
		{
			System.out.println(s1 + " and " + s2 + " is not polindrome");
		}
	}
}
