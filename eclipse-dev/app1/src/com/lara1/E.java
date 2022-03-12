package com.lara1;
interface C
{
	void test1();
	void test2();
}
abstract class D implements C
{
	public void test1()
	{
		System.out.println("from test1()");
	}
}
public class E extends D{
	public void test2()
	{
		System.out.println("from test2()");
	}
	public static void main(String[] args) {
		E e1 = new E();
		e1.test1();
		e1.test2();
	}

}
