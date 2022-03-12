package com.lara;

public class M2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		sb.append("hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
