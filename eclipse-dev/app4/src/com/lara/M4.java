package com.lara;

public class M4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(120);//any number you can specify
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
