package com.stringLogical;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		String email = "vijendra.p@gmail.com";
		int i = email.indexOf('.');
		int j = email.indexOf('@');
		String s2 = email.substring(++i, j);
		int k = email.indexOf(s2);
		if(k <= 0)
		{
			System.out.println("yes it is...");
		}else
		{
			System.out.println("nothing...");
		}
		int l = email.indexOf('.', i);
		System.out.println(i + " ," + j + ", "+ s2 + ", " + k +", " + l );
	}
}
