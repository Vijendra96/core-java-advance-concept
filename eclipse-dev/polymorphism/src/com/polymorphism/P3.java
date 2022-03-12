package com.polymorphism;
class X
{
	static int i = 100;
	static
	{
		System.out.println("sib - X");
	}
}
class Y extends X
{
	static 
	{
		System.out.println("sib-Y");
	}
}
public class P3 {
	public static void main(String[] args) {
		System.out.println(Y.i); //X.i;
	}
}

//i is a Class X member only.
// X class only loading Y class is not loading becouse of i is not a member of Y.
