package com.multiThreading;
class I implements Runnable
{
	@Override
	public void run() 
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M10 {
	public static void main(String[] args) {
		I obj = new I();
		Thread t1 = new Thread(obj);
		t1.start();
		
		Thread t2 = new Thread(obj);
		t2.start();
		for(int i = 5000; i < 6000; i++)
		{
			System.out.println(i);
		}
	}
}
