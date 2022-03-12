package com.lara;

public class M7 {
	public static void main(String[] args) {
		String s1 = "hello";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}
}
