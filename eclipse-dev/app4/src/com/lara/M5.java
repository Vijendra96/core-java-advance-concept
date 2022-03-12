package com.lara;

public class M5 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//any number you can specify
		sb.append("abc");
		sb.append("xyz");
		sb.append("hello");
		System.out.println(sb);
		sb.reverse(); //reverse method available in the StringBuffer
		System.out.println(sb);
	}
}
