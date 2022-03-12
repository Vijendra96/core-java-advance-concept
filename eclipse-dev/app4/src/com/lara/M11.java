package com.lara;

import java.util.Scanner;

/*
51. Given a string, compute a new string by moving the first char to come
after the next two chars, so "abc" yields "bca". Repeat this process for
each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any
group of fewer than 3 chars at the end.
oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */
public class M11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ...");
		String s1 = sc.next();
		String substr = "";
		for (int i = 0; i < (s1.length() - 2); i += 3) 
		{
				substr = s1.substring(i, i + 3);
				substr = substr.substring(1) + substr.substring(0, 1);
				s1 = s1.substring(0, i) + substr + s1.substring(i + 3);
		}
		System.out.println(s1);
	}
}
