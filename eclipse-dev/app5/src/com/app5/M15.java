package com.app5;

public class M15 {
	public static void main(String[] args) {
		A a1 = new B();	//auto up casting
		System.out.println(a1.i);
		//System.out.println(a1.j);
		
		a1.test1();
		//a1.test2();
		
		if(a1 instanceof B)
		{
			B b1 = (B) a1;
			System.out.println(b1.i);
			System.out.println(b1.j);
			b1.test1();
			b1.test2();
		}
		
		System.out.println("done ....");
	}
}

/*
1.	no matter what is the object type, compile always check what is the data type of reference/what is the reference type, 
	no matter to where pointing.
2.	i is available in class A but j is not,
3.	test1() is available in class A while test2() is not available
4.	whenever auto casting is there, we are not able to access all the members of the object, to access all the members we need to down casting
5.	if there is no up casting we are able to use every member of the object. 


6.	down casting is not advisable/recommended
*/