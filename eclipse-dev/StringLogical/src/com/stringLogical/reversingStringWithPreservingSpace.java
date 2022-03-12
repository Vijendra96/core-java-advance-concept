package com.stringLogical;
//18. Write a java program to reverse a given string with preserving the position of spaces?
import java.util.Scanner;

public class reversingStringWithPreservingSpace 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ....");
		String s1 = sc.nextLine();
		char[] inputArray = s1.toCharArray();
		char[] result = new char[inputArray.length];
	
	
	
		// Mark spaces in result
		for (int i = 0; i < inputArray.length; i++) 
		{
			if (inputArray[i] == ' ') 
			{
				result[i] = ' ';
			}
		}
		// Traverse input string from beginning
		// and put characters in result from end
		int j = result.length - 1;
		for (int i = 0; i < inputArray.length; i++) 
		{

			// Ignore spaces in input string
			if (inputArray[i] != ' ') 
			{

				// ignore spaces in result.
				if (result[j] == ' ') 
				{
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
		System.out.println(result);
		}
	}

