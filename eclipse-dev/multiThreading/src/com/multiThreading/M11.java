package com.multiThreading;
class J implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

class K implements Runnable
{
	public void run()
	{
		for(int i = 3000; i < 4000; i++)
		{
			System.out.println(i);
		}
	}
}


public class M11 {
	public static void main(String[] args) 
	{
		J j1 = new J();
		Thread t1 = new Thread(j1);
		t1.start();
		
		
		K k1 = new K();
		Thread t2 = new Thread(k1);
		t2.start();
		
		for(int i = 3000; i < 4000; i++)
		{
			System.out.println(i);
		}
	}
}
