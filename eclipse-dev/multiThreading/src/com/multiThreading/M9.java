package com.multiThreading;
class H implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M9 {
	public static void main(String[] args) {
		H h1 = new H();
		Thread t1 = new Thread(h1);
		t1.start();
		for(int i = 2000; i < 5000; i++)
		{
			System.out.println(i);
		}
	}
}
