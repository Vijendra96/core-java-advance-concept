package com.multiThreading;
class W2
{
	void test()
	{
		System.out.println("test begin by " + Thread.currentThread().getName());
		synchronized (this) // mutext ===> mutually exclusive
		{
			for(int i = 1; i <= 20; i++)
			{
				System.out.println("loop by " + Thread.currentThread().getName() + " : " + i);
				Util.sleep(1000);
			}
		}
		
		System.out.println("test end by " + Thread.currentThread().getName());
	}
}


class X2 extends Thread
{
	W2 w1;
	X2(W2 w1)
	{
		this.w1 = w1;
	}
	@Override
	public void run() {
		w1.test();
	}
}


class Y2 extends Thread
{
	W2 w1;
	Y2(W2 w1)
	{
		this.w1 = w1;
	}
	@Override
	public void run() {
		w1.test();
	}
}


public class M18 {
	public static void main(String[] args) {
		W2 obj = new W2();
		X2 x2 = new X2(obj);
		x2.start();
		
		Y2 y2 = new Y2(obj);
		y2.start();
	}
}

//only for loop is synchronized