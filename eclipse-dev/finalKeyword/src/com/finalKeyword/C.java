package com.finalKeyword;

public class C {
	final int i = 20;
	public static void main(String[] args) {
		C c1 = new C();
		c1 = new C();
		c1 = null;
		c1 = new C();
		//c1.i = 20;

	}
}

// C in not final, can be modify any number of time, while i is final it can't be modify..
