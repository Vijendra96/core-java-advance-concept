package com.app3;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something here ...");
		String s1 = sc.nextLine();
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		char temp;
		for (int i = 0; i < s1.length() / 2; i++) {
			temp = chars[i];
			chars[i] = chars[chars.length -1 - i];
			chars[chars.length - 1 - i] = temp;
		}
		String s2 = new String(chars);
		System.out.println(s2);
	}
}
