package com.lara;

public class M3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		sb.append("hello");
		System.out.println(sb);
		System.out.println(sb.capacity());//by default capacity of StringBuffer is 16 characters, it increases automatically
		System.out.println(sb.length());
		System.out.println("--------------");
		sb.trimToSize(); //it removes unoccupied location of StringBuffer Object
		System.out.println(sb.capacity()); //capacity and length will be same
		System.out.println(sb.length());
	}
}
