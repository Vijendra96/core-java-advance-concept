package com.app5;

public class Test {
	static void test1(Object obj)
	{
		System.out.println("test1 begin");
		C c1 = (C) obj;
		System.out.println("test1 end");
	}
	static void test2(Object obj)
	{
		System.out.println("test2 begin");
		if(obj instanceof C)
		{
			C c1 = (C) obj;
		}
		System.out.println("test2 end");
	}
}
