package com.lara;
/*
 50. Given a string, return the sum of the digits 0-9 that appear in the string,
ignoring all other characters. Return 0 if there are no digits in the string.
(Note: Character.isDigit (char) tests if a char is one of the chars
'0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
 */
import java.util.Scanner;

public class M10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ...");
		String str = sc.nextLine();//aa11b33
		int sum = 0;
		char c1;
		for (int i = 0; i < str.length(); i++) 
		{
			c1 = str.charAt(i);
			if (Character.isDigit(c1)) 
			{
				sum += Integer.parseInt(Character.toString(c1));
			}
		}
		System.out.println(sum);
	}
}
