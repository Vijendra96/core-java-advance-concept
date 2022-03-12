package com.multiThreading;

class L extends Thread
{
	L(String name, ThreadGroup tg)
	{
		super(tg, name);
	}
	@Override
	public void run() 
	{
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getName() + " : " + i);
		}
	}
}

class M implements Runnable
{

	@Override
	public void run() 
	{
		for(int i = 1000; i <= 2000; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

public class M12 
{
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("group1");
		L t1 = new L("1st", tg);
		L t2 = new L("2st", tg);
		L t3 = new L("3st", tg);
		
		M obj = new M();
		Thread t4 = new Thread(tg, obj, "4th");
		Thread t5 = new Thread(tg, obj, "5th");
		Thread t6 = new Thread(tg, obj, "6th");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
		tg.stop();
	}
}







