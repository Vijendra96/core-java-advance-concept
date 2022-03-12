package com.app5;

public class M12 {
	public static void main(String[] args) {
		A a1 = new C();
		if(a1 instanceof B)
		{
			B b1 = (B) a1;
			System.out.println("converted into B");
		}
		if(a1 instanceof C)
		{
			C c1 = (C) a1;
			System.out.println("converted into C");
		}
		if(a1 instanceof D)
		{
			D d1 = (D) a1;
			System.out.println("converted into D");
		}
	}
}
