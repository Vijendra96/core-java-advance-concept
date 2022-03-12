package com.multiThreading;
class R extends Thread
{
	ThreadLocal t;
	R(ThreadLocal t)
	{
		this.t = t;
	}
	@Override
	public void run() {
		System.out.println(1 + " : " + t.get());
		t.set(10);
		Util.sleep(100);
		System.out.println(2 + " : " + t.get());
		t.set(20);
		Util.sleep(100);
		System.out.println(3 + " : " + t.get());
		t.set(30);
		Util.sleep(100);
		System.out.println(4 + " : " + t.get());
		t.set(40);
		Util.sleep(100);
	}
}
class S extends Thread
{
	ThreadLocal t;
	S(ThreadLocal t)
	{
		this.t = t;
	}
	@Override
	public void run() {
		System.out.println(5 + " : " + t.get());
		t.set(50);
		Util.sleep(100);
		System.out.println(6 + " : " + t.get());
		t.set(60);
		Util.sleep(100);
		System.out.println(7 + " : " + t.get());
		t.set(70);
		Util.sleep(100);
		System.out.println(8 + " : " + t.get());
		t.set(80);
		Util.sleep(100);
	}
}
public class M15 {
	public static void main(String[] args) {
	ThreadLocal  t = new ThreadLocal();
	t.set(90);
	
	R r1 = new R(t);
	r1.start();
	
	Util.sleep(50);
	
	S s1 = new S(t);
	s1.start();
	
	Util.sleep(10000);
	System.out.println(t.get());
	
	}
}
