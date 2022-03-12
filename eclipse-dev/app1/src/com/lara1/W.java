package com.lara1;
class abc
{
	int test1()
	{
		System.out.println("abc-test1()"); 
		return 1000;
	}
	String test1(int i)
	{
		System.out.println("abc-test1(int)");
		return "xyz";
	}
	//same method name with difference in the signature
}

public class W 
{
	public static void main(String[] args) {
		abc ref = new abc();
		ref.test1();
		System.out.println("----------------");
		System.out.println(ref.test1());
		System.out.println("----------------");
		ref.test1(100);
		System.out.println("----------------");
		System.out.println(ref.test1(100));
	}
}
