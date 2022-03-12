package com.multiThreading;

public class M8 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++)
		{
			System.out.println("loop begin : " + i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException ex) 
			{
				ex.printStackTrace();
			}
			System.out.println("loop end : " + i);
		}
	}
}
