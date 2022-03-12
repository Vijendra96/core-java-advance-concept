package com.lara1;
abstract class Q1
{
	abstract void test();
}
class R1 extends Q1
{
	void test(int i)
	{
		System.out.println("hello");
	}

	@Override
	void test() 
	{
			System.out.println("from R1");
	}
}


public class U
{
	public static void main(String[] args) {
		R1 ref = new R1();
		ref.test();
		ref.test(0);
	}
}
