package com.app5;
//Explicit down casting
public class M4 {
	public static void main(String[] args) {
		A a1 = new C();
		B b1 = (B) a1;	//Explicit down casting
		C c1 = (C) a1;	//Explicit down casting
		System.out.println("done");
	}
}
