//method overloading
package com.lara1;
class K11
{
	void test1()
	{
		System.out.println("K-test1()"); 
	}
	void test1(int i)
	{
		System.out.println("K-test1(int)");
	}
	//same method name with difference in the signature
}
public class R {
	public static void main(String[] args) {
		K11 ref = new K11();
		ref.test1();
		ref.test1(100);
	}
}



/*
	method overloading :
	1.	overloaded methods can have any return types.
	2.	overloaded methods can have any access levels.
	3.	overloaded methods can be all non-static or all static of few can be static or few can be non-static.
	4.	while overloading a method only one condition we have to follow and that is, method name should be same 
		and signature should be different.
	5.	overloading method can have inheritance method also.

*/