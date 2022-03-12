package com.multiThreading;
class W1
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
			System.out.println(this + " : " + Thread.currentThread().getName() + " : test2 : " + i);
			Util.sleep(1000);
		}
	}
}

class X1 extends Thread
{
	W1 t;
	X1(W1 w)
	{
		this.t = w;
	}
	public void run()
	{
		t.test1();
	}
}

class Y1 extends Thread
{
	W1 t;
	Y1(W1 w)
	{
		this.t = w;
	}
	public void run()
	{
		t.test2();
	}
}

public class M19 {
	public static void main(String[] args) {
		W1 w1 = new W1();
		W1 w2 = new W1();
		X1 x1 = new X1(w1);
		x1.start();
		
		Y1 y1 = new Y1(w2);
		y1.start();
		
		System.out.println("done ...");
		
	}
}



//synchronization is that which is allowing only one thread at a time.
//sequential execution of the thread. one object can't be access by thread simultaneously.
//no object enter into synchronized method straight away without a object lock.
//every object having only one object lock.
//every synchronized method looking for a object lock.
