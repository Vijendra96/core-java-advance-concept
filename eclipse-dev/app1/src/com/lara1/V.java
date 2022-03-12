package com.lara1;
class S1
{
	 void test()
	{
		System.out.println("test");
	}
}
class T1 extends S1
{
	protected void test()
	{
		System.out.println("T - test begin");
		super.test();
		System.out.println("T - test end");
	}
}
public class V {
	public static void main(String[] args) {
		T1 ref = new T1();
		ref.test();
	}
}
