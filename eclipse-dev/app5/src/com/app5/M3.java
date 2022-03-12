package com.app5;
//covarient
class M
{
	A test()
	{
		System.out.println("M-test");
		return null;
	}
}
class N extends M
{
	B test() //	B is subclass to A, so we can use B, C or D as a return type instead of A, it is called co-variant
	{
		System.out.println("N-test");
		return null;
	}
}
public class M3 {
	public static void main(String[] args) {
		N obj = new N();
		obj.test(); //method overriding
	}
}
