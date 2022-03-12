package com.lara;

public class M6 {
	public static void main(String[] args) {
		String s1 = "hello";
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s2 = sb.toString();
		System.out.println(s1);
		System.out.println(s2);
	}
}
