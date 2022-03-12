package pack1;

public class E {
	public static void main(String[] args) {
		class A
		{
			void test()
			{
				System.out.println("from test");
			}
		}
		A a1 = new A();
		a1.test();
		a1.test();
		a1.test();
	}
}


//local inner class
// class can be inside a method or inside a constructor or inside a SIB or inside a IIB
//within the local block it can not be used outside