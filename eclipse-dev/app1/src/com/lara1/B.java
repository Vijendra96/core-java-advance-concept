package com.lara1;
interface A
{
	int i = 20;
	void test1();
	void test2();
}
public class B implements A{
	public void test1()
	{
		System.out.println("B - test1()");
	}
	public void test2()
	{
		System.out.println("B - test2()");
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test2();
		System.out.println(A.i);
	}
}
