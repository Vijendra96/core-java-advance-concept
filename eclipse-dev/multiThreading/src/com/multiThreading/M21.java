package com.multiThreading;
//deadlock
class Z
{
		synchronized void test1(Z obj)
	{
		System.out.println("test1 begin");
		Util.sleep(200);
		obj.test2(this);
		System.out.println("test1 end");
	}
	synchronized void test2(Z obj)
	{
		System.out.println("test2 begin");
		Util.sleep(200);
		obj.test1(this);
		System.out.println("test2 end");
	}
}
public class M21 {
	public static void main(String[] args) {
		Z z1 = new Z();
		Z z2 = new Z();
		Thread t1 = new Thread()
					{
						public void run()
						{
							z1.test1(z2);
						}
					};
		t1.start();
		Util.sleep(10);
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				z2.test1(z1);
			}
		};
t2.start();
	}
}
