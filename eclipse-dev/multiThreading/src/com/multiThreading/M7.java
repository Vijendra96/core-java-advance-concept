package com.multiThreading;
class G extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("G thread : " + i);
		
		}
	}
}
public class M7 {
	public static void main(String[] args) throws InterruptedException {
		G g1 = new G();
		g1.start();
		g1.join();
		System.out.println("done");
	}
}
