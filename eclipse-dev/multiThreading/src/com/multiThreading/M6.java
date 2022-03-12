package com.multiThreading;
class F extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("F thread : " + i);
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.setDaemon(true);
		f1.start();
		System.out.println("done");
	}
}


//main is a parent thread while F thread is child to main
//child thread is continuing even though main is terminating