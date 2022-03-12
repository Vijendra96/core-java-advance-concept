package com.multiThreading;

class B extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M3 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.start();
		a2.run();
		for (int i = 5000; i <= 6000; i++) 
		{
			System.out.println(i);
		}
	}
}
