package com.finalKeyword;

public class A {
	public static void main(String[] args) {
		final int i = 10;
		System.out.println(i);
		System.out.println(i);
		int j = i;
		int k = i + 100;
		System.out.println(k);
		//i = 10;
	}
}

//final variable can be used any number of time
