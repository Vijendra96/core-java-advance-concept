package com.string;

import java.util.Scanner;
//remove the first white space
public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter somethig here ....");
		String s1 = sc.nextLine();
		System.out.println(s1);
		int index = s1.indexOf(' ');
		s1 = s1.substring(0 , index) + s1.substring(index + 1);
		System.out.println(s1);
		System.out.println("----------------");
		s1 =  s1.replaceFirst(" " , "");
		System.out.println(s1);
	}
}
