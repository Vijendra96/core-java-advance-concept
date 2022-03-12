package com.lara1;
//method overriding
class O1
{
	void test()
	{
		System.out.println("from O-test()");
	}
}
class P11 extends O1
{
    void test()
	{
		System.out.println("p-test()");
		
	}
}
public class T {
	public static void main(String[] args) {
		P11 ref = new P11();
		ref.test();
	}
}


/*

	method overriding :
	1.	both the superclass and the subclass must have same method name, same return type and the same signature. 
	2.	we can not override the method declared as final and static.
	3.	static method can not be override with non- static method and vice versa.

*/