package com.app5;

public class M6 {
	public static void main(String[] args) {
		A a1 = new B();
		B b1 = (B) a1;
		System.out.println("done");
		
		A a2 = new A();
		B b2 = (B) a2;// after creating an object you can't add any thing
		System.out.println("done");
	}
}
