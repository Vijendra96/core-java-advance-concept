package com.stringLogical;
//to checking strings are anagrams or not
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first word ...");
		String s1 = sc.nextLine();
		System.out.println("enter the second word");
		String s2 = sc.nextLine();
		int index = 0;
		boolean isAnagram = true;
		char c1;
		for (int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			index = s2.indexOf(c1);
			if (index != -1)
			{
				s2 = s2.substring(0, index) + s2.substring(index + 1);
			}else
			{
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram && s2.length() == 0 ? 
			(s1 + " and " + s2 + " are anagrams") : (s1 + " and " + s2 + " are not anagrams"));
	}
}
