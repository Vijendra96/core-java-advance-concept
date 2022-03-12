package com.lara1;
interface A1
{
	void test1();
	void test2();
}
interface B1
{
	void test3();
}
class C1
{
	void test4()
	{
		System.out.println("C-test4");
	}
}
class D1 extends C1 implements A1, B1
{
	@Override
	public void test3() 
	{
		System.out.println("D-test3");
	}

	@Override
	public void test1() 
	{
		System.out.println("D-test1");
	}

	@Override
	public void test2() 
	{
		System.out.println("D-test2");
	}
	
}
public class O 
{
	public static void main(String[] args) 
	{
		D1 ref = new D1();
		ref.test1();
		ref.test2();
		ref.test3();
		ref.test4();
	}
}
