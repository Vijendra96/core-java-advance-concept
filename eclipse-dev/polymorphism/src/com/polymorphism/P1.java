package com.polymorphism;
class P
{
	void test()
	{
		System.out.println("P-test");
	}
}
class Q extends P
{
	void test()
	{
		System.out.println("Q-test");
	}
}
class R extends Q
{
	void test()
	{
		System.out.println("R-test");
	}
}
public class P1 {
	public static void main(String[] args) {
		P p1 = new P();
		Q q1 = new Q();
		R r1 = new R();
		P p2 = new Q();
		P p3 = new R();
		Q q2 = new R();
		P[] elements = {p1, q1, r1, p2, p3, q2};
		for(P element : elements)
		{
			element.test();
		}
	}
}
