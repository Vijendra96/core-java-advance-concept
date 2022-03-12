package com.finalKeyword;

public class D {
	int i = 10;
	public static void main(String[] args) {
		final D d1 = new D();
		d1.i = 20;
		d1.i = 30;
		//d1 = new D();
		
	}
}

//d1 is a final, can't be modify, while i is not a final so it can modify any number of time