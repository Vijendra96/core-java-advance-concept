package com.app5;

public class M7 {
	public static void main(String[] args) {
		A a1 = new C();// C contain i. j, k and test1.test5 and test3
		B b1 = (B) a1;
		System.out.println("don1");
		C c1 = (C) b1;
		System.out.println("done2");
		D d1 = (D) a1;// D contain i. j, k, l and test1.test2 and test3, test4
		System.out.println("done3");
	}
}


//ClassCastException at line number 10