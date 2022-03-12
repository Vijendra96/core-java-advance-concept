package com.stringLogical;
/*	to checking whether given string having proper email id format or not?
 	1.	@ is must and should
	2.	minimum one dot after @
 */

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your email id ...");
		String email = sc.nextLine();
		int i = email.indexOf('@');
		if(i != -1)
		{
			int j = email.indexOf('.', i);
			if(j != -1)
			{
				System.out.println(email + " is in proper format");
			}
			else
			{
				System.out.println(email + " doesn't have minimum ome . after @");
			}
		}
		else
		{
			System.out.println(email + " does not have @");
		}
	}
}
