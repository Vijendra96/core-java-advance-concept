package com.string;

import java.util.Scanner;
//reverse a given string
public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter somethig");
		String s1 = sc.nextLine();
		System.out.println(s1);
		String s2 = "";
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}

}
