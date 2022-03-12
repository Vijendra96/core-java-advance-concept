package com.multiThreading;
class N extends Thread
{
	
	public void run() 
	{
		System.out.println(getName() + ":" + 1);
		Util.sleep(100);
		System.out.println(getName() + ":" + 2);
		Util.sleep(100);
		System.out.println(getName() + ":" + 3);
	}
}
class O extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(getName() + ":" + 4);
		Util.sleep(100);
		System.out.println(getName() + ":" + 5);
		Util.sleep(100);
		System.out.println(getName() + ":" + 6);
	}
}
public class M13 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ":" + 7);
		N n1 = new N();
		n1.start();
		Util.sleep(50);
		O o1 = new O();
		o1.start();
		Util.sleep(10000);
		System.out.println(Thread.currentThread().getName() + ":" + 8);
	}
}
