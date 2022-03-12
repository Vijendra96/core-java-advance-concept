package com.multiThreading;
class E extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("E thread : " + i);
		}
	}
}

public class M5 {
	public static void main(String[] args) {
		E ref = new E();
		ref.start();
		System.out.println("done");
	}
}
