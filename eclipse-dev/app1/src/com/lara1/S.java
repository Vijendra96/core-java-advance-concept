package com.lara1;
class L1
{
	void test()
	{
		System.out.println("L1-test()");
	}
}
class M1 extends L1
{
	void test(int i)
	{
		System.out.println("M1-test(int)");
	}
}
public class S {
	public static void main(String[] args) {
		M1 ref = new M1();
		ref.test();
		ref.test(100);
	}
}
