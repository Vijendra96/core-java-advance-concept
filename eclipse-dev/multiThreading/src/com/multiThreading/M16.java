package com.multiThreading;
class T
{
	void test() // test() is synchronized
	{
		for(int i = 1; i <= 20; i++)
		{
			System.out.println(this + " : " + Thread.currentThread().getName() + " : " + i);
			Util.sleep(1000);
		}
	}
}

class U extends Thread
{
	T t;
	U(T t)
	{
		this.t = t;
	}
	public void run()
	{
		t.test();
	}
}

class V extends Thread
{
	T t;
	V(T t)
	{
		this.t = t;
	}
	public void run()
	{
		t.test();
	}
}

public class M16 {
	public static void main(String[] args) {
		T t = new T();
		U u1 = new U(t);
		u1.start();
		
		V v1 = new V(t);
		v1.start();
		
		System.out.println("done ...");
		
	}
}

/*
 		test() method is executing with two threads simultaneously.
 		two threads are executing simultaneously with same object.
 */
