package pack1;

public class F {
	public static void main(String[] args) {
		int i = 0;
		final int j = 0;
		
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		
		A a1 = new A();
		a1.test();
		
		//i = 0;
	}
}


//	i will be acting as a final it can not modified further
// inside a local inner class only final variable is required
// if any local variable changing then it can not use inside the inner class.
// if any local variable can not change then it can  use inside the inner class.
// local inner class allowed to use within the current block..