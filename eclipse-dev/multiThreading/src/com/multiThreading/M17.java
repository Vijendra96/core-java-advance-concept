package com.multiThreading;
class W
{
	synchronized void test1() // test() is synchronized
	{
		for(int i = 1; i <= 20; i++)
		{
			System.out.println(this + " : " + Thread.currentThread().getName() + " : test1 : " + i);
			Util.sleep(1000);
		}
	}
	
	synchronized void test2() // test() is synchronized
	{
		for(int i = 1; i <= 20; i++)
		{
			System.out.println(this + " : " + Thread.currentThread().getName() + " : test12 : " + i);
			Util.sleep(1000);
		}
	}
}

class X extends Thread
{
	W t;
	X(W w)
	{
		this.t = w;
	}
	public void run()
	{
		t.test1();
	}
}

class Y extends Thread
{
	W t;
	Y(W w)
	{
		this.t = w;
	}
	public void run()
	{
		t.test2();
	}
}

public class M17 {
	public static void main(String[] args) {
		W w = new W();
		X x1 = new X(w);
		x1.start();
		
		Y y1 = new Y(w);
		y1.start();
		
		System.out.println("done ...");
		
	}
}



//synchronization is that which is allowing only one thread at a time.
//sequential execution of the thread. one object can't be access by thread simultaneously.
//no object enter into synchronized method straight away without a object log.
//every object having only one object log.
//every synchronized method looking for a object log.
