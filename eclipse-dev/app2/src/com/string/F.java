package com.string;

import java.util.Scanner;
public class F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter somethig here ....");
		String s1 = sc.nextLine();
		System.out.println(s1);
		String[] words = s1.split(";");
		for (String word : words) 
		{
			System.out.println(word);
		}
	}
}
