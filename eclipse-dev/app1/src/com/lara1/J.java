package com.lara1;

public class J implements H, I {

	@Override
	public void test2() {
		System.out.println("from test-2");
	}

	@Override
	public void test1() {
		System.out.println("from test-1");
	}
	public static void main(String[] args) {
		J j1 = new J();
		j1.test1();
		j1.test2();
		System.out.println("done");
	}
	
}
