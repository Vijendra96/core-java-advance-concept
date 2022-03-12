package com.finalKeyword;

public class B {
	public static void main(String[] args) {
		final int[] elements = new int[9];
		System.out.println(elements[0]);
		elements[2] = 300;
		//elements = new int[9];
	}
}

//elements is final, it cant't be modify.
//elements[0] and elements[2] it is not final.
