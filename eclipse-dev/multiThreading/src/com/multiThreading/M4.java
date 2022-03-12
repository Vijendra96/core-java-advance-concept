package com.multiThreading;
class C extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("C thread : " + i);
		}
	}
}
class D extends Thread
{
	@Override
	public void run() {
		for(int i = 100; i <= 2000; i++)
		{
			System.out.println("D thread : " + i);
		}
	}
}

public class M4 {
	public static void main(String[] args) {
		C ref = new C();
		ref.start();
		
		D obj = new D();
		obj.start();
		
		for (int i = 2000; i <= 3000; i++) {
			System.out.println("main thread : " + i);
		}
	}
}
