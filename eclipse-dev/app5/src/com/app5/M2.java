package com.app5;

public class M2 {
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		
		B b1 = new C();
		B b2 = new D();
		
		C c1 = new D();
		C c2 = new D();
		
		D d1 = new D();
		A a3 = d1;
		A a4 = b1;
		A a5 = c1;
		
		Object obj1 = new C();
		Object obj2 = new D();
		
		System.out.println("done");
	}
}
