package com.multiThreading;
class Test
{
	int i;
}
class P extends Thread
{
	Test t;
	P(Test t)
	{
		this.t = t;
	}
	public void run()
	{
		System.out.println(1 + " : " + t.i);
		t.i = 10;
		Util.sleep(100);
		System.out.println(2 + " : " + t.i);
		t.i = 20;
		Util.sleep(100);
		System.out.println(3 + " : " + t.i);
		t.i = 30;
		Util.sleep(100);
		System.out.println(4 + " : " + t.i);
		t.i = 40;
		Util.sleep(100);
		System.out.println(5 + " : " + t.i);
	}
}

class Q extends Thread
{
	Test t;
	Q(Test t)
	{
		this.t = t;
	}
	public void run()
	{
		System.out.println(6 + " : " + t.i);
		t.i = 50;
		Util.sleep(100);
		System.out.println(7 + " : " + t.i);
		t.i = 60;
		Util.sleep(100);
		System.out.println(8 + " : " + t.i);
		t.i = 70;
		Util.sleep(100);
		System.out.println(9 + " : " + t.i);
		t.i = 80;
		Util.sleep(100);
		System.out.println(10 + " : " + t.i);
	}
}
public class M14 {
	public static void main(String[] args) {
		Test t = new Test();
		t.i = 90;
		P p1 = new P(t);
		p1.start();
		Util.sleep(50);
		Q q1 = new Q(t);
		q1.start();
		Util.sleep(10000);
		System.out.println(11 + " : " + t.i);
		
	}
}
