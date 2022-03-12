package com.string;

import java.util.Scanner;
//how to replace a char inside a string
public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter somethig here ....");
		String s1 = sc.nextLine();
		System.out.println(s1); 
		s1 = s1.replace('a', 'A');
		System.out.println(s1);
		System.out.println("---------");
		s1 = s1.replace("vi", "VI");
		System.out.println(s1);
		System.out.println("---------");
		s1 = s1.replaceAll("vijendra", "VIJENDRA");
		System.out.println(s1);
	}
}
