//17. Write a java program to check whether one string is a rotation of another?
package com.stringLogical;
/*
 	Algorithm :
 1. Define two string 1 and string 2.
 2. To check whether string 2 is rotation of string 1 then, first check the length of both the strings. If they are not equal, then string 2 cannot be a rotation of string 1.
 3. Concatenate string 1 with itself and assign it to string 1.
 4. Check the index of string 2 in string 1. If it exists then, string 2 is a rotation of string 1.
 */
import java.util.Scanner;

public class rotationOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1 = sc.nextLine();
		
		System.out.println("enter the second string");
		String s2 = sc.nextLine();
		
		
		if(s1.length() != s2.length())
		{
			System.out.println(s2 + " is not a rotation of " + s1);
		}
		else
		{
			s1 = s1.concat(s1);
			if(s1.indexOf(s2) != -1)
			{
				System.out.println(s2 + " is a rotation of " + s1);
			}else
			{
				System.out.println(s2 + " is not a rotation of " + s1);
			}
		}
	}
}
