package com.string;

import java.util.Scanner;
//reverse a string using swapping method 
public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter somethig here ....");
		String s1 = sc.nextLine();
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		char temp;
		for(int i = 0; i < chars.length / 2; i++)
		{
			temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;
		}
		String s2 = new String(chars);
		System.out.println(s2);
	}
}
