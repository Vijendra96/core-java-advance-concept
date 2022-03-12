package com.lara;
interface IFace
{
	void test1();
	void test2();
}
public class C implements IFace{

	@Override
	public void test1() {
		System.out.println("from test1");
	}

	@Override
	public void test2() {
		System.out.println("from test2");
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}
}
