package com.lara1;
interface E1
{
	void test1();
}
interface F1 extends E1 // an interface can extends with another interface
{
	void test2();
}
class G1 implements F1
{
	@Override
	public void test1() 
	{
		System.out.println("from G1-test1");
	}

	@Override
	public void test2() 
	{
		System.out.println("from G1-test2");
	}
	
}
public class P {
	public static void main(String[] args) {
		G1 ref = new G1();
		ref.test1();
		ref.test2();
	}
}
