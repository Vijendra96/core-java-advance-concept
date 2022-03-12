package com.app5;

public class M8 {
	public static void main(String[] args) {
		A a1 = new C();
		B b1 = (B) a1;
		C c1 = (C) b1;
		C c2 = (C) a1;
		System.out.println("-----------");
		D d1 = (D) b1;
		System.out.println("done");
	}
}
