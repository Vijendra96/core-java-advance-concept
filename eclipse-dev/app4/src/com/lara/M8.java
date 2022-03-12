package com.lara;

public class M8 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("abc");
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
	}
}
