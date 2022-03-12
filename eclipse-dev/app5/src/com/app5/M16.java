package com.app5;

public class M16 {
	public static void main(String[] args) {
		A a1 = new C();//auto up casting
		C c1 = new C();
		System.out.println(a1.i);
		//System.out.println(a1.j);
		//System.out.println(a1.k);
		a1.test1();
		//a1.test2();
		//a1.test3();
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		c1.test1();
		c1.test2();
		c1.test3();
	}
}

//1.	if there is Auto up casting we are not able to use every member of the object. 
//2.	to achieve polymorphism two things are required
		// 1.	method overriding
		// 2.	auto up casting
