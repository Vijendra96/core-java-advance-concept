package com.app3;
//to read the characters of a string
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something here ...");
		String s1 = sc.nextLine();
		System.out.println(s1);
		char[] c1 = s1.toCharArray();
		for (char c : c1) {
			System.out.println(c);
		}
	}
}
