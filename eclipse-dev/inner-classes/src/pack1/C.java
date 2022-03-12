package pack1;

import pack1.B.P;
import pack1.B.Q;

public class C {
	class P
	{
		
	}
	static class Q
	{
		
	}
	public static void main(String[] args) {
		//P p1 = new P();
		P p1 = null;
		Q q1 = new Q();
		
		C c1 = new C();
		P p2 = c1.new P(); //to create a reference of P
		P p3 = new C().new P(); //to create a reference of P
		System.out.println("done ...");
	}
}

//non static member can not be used inside the static method.
//class Q is the static and main method is also static
//class P is a non-static class so it can not be used inside the static method
//you can used any class anywhere if the uses is of data type uses. 