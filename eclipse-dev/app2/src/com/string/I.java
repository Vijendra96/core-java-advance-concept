package com.string;

import java.util.Scanner;
//swapping two string without temp variable
public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string here ....");
		String s1 = sc.nextLine(); //abc
		
		System.out.println("enter second string here ....");
		String s2 = sc.nextLine(); //hello
		System.out.println("before swapping the given first String is : " + s1 + " and second string is : " + s2);
		
		//swapping without temp variable
		s1 = s1 + s2; // s1 = abchello, s2 = hello
		s2 = s1.substring(0, (s1.length() - s2.length())); // s2 = s1.substring(0, 3); = abc, s1 = abchello
		s1 = s1.substring(s2.length()); //s1.substring(3); s1 = hello
		System.out.println("after swapping the given first String is : " + s1 + " and second string is : " + s2); 

	}
}
