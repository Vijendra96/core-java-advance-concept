package com.polymorphism;
class U
{
	static void test()
	{
		System.out.println("U-test");
	}
}
class V extends U
{
	static void test()
	{
		System.out.println("V-test");
	}
}
public class P2 {
	public static void main(String[] args) {
		U u1 = new U();
		V v1 = new V();
		U[] elements = {u1, v1};
		for(U element : elements)
		{
			element.test();//U.test();
		}
	}
}

//static methods are not involving in the polymorphism.
//Because polymorphism is an object oriented concept, static is not object member, static is a class member.
//U class test methods it is always belong to the U class Only.
//V class test methods it is always belong to the V class Only.
//even though inheriting to V, still it is acting as a U class member only. 