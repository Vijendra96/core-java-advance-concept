package com.pack2;

import com.multiThreading.Util;

/*
 
 
 	object
 	=========
 	1. wait();
 	2. notify();
 	3. notifyAll();
 		these three are non-synchronized
 	we can achieve enter thread communication
 	enter thread communication is based on object lock
 	
 	
 */


class A{
	synchronized void test1()
	{
		System.out.println("from test1 begin");
		try
		{
			System.out.println("test1 before wait");
			wait();
			System.out.println("test1 after wait");
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("from test1 end");
	}
	synchronized void test2()
	{
		System.out.println("from test2 begain");
		notifyAll();
		System.out.println("from test2 end");
	}
}
class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}class C extends Thread
{
	A obj;
	C(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}


public class M1 {
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		B b1 = new B(a1);
		b1.start();
		
		C c1 = new C(a1);
		c1.start();
		
		Util.sleep(10000);
		System.out.println("--- main after sleep ---");
		//a1.test2();
		//a2.test2();
		
		synchronized (a2) {
			a2.notifyAll();
		}
		
	}
}
