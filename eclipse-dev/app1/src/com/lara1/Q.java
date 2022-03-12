package com.lara1;

interface G11
{
	void test1();
}

interface H1
{
	void test2();
}

interface I1 extends G11, H1
{
	void test3();
}

class K1 implements I1
{
	public void test1() 
	{
		System.out.println("from K-test1");
	}

	@Override
	public void test2() 
	{
		System.out.println("from K-test2");
	}

	@Override
	public void test3() 
	{
		System.out.println("from K-test3");
	}
	
}

public class Q {
	public static void main(String[] args) {
		K1 ref = new K1();
		ref.test1();
		ref.test2();
		ref.test3();
	}
}
