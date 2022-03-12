package com.lara1;
interface K
{
	void test1();
}
interface L
{
	void test2();
}
class M
{
	void tets3()
	{
		System.out.println("M-test3");
	}
}
public class N extends M implements K, L {
	@Override
	public void test2() {
		System.out.println("N-test2");		
	}
	@Override
	public void test1() {
		System.out.println("N-test1");		
	}
	public static void main(String[] args) {
		N n1 = new N();
		n1.test1();
		n1.test2();
		n1.tets3();
	}
}
