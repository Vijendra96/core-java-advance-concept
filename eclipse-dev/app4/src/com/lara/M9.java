package com.lara;
/*
Given a string, return the sum of the numbers appearing in the string,
ignoring all other characters. A number is a series of 1 or more digit chars
in a row. (Note: Character.isDigit (char) tests if a char is one of the chars
'0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */
import java.util.Scanner;

public class M9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ...");
		String str = sc.nextLine();
		String numbericStr = "";
		int sum = 0;
		char c1;
		for (int i = 0; i < str.length(); i++) 
		{
			c1 = str.charAt(i);
			if (Character.isDigit(c1)) 
			{
				numbericStr += c1;
			}
			else
			{
				if(numbericStr.length() != 0)
				{
					sum += Integer.parseInt(numbericStr.trim());
				}
				numbericStr = "";
			}
		}
		if(numbericStr.length() != 0)
		{
			sum += Integer.parseInt(numbericStr.trim());
		}
		System.out.println(sum);
	}
}
