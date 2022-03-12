package pack1;
class Test	//classes only for object creation
{
	class R
	{
	//	jdk 1.8, static member can not be define in the noon static member
	
		
	//	static int i;
	//	static void test()
	//	{
			
	//	}
		int j;				//non static member can be develop any where
		void test2()
		{
			
		}
	}
	static class S
	{
		
	}
}
public class D {
	public static void main(String[] args) {
		//R r1 = null;
		//S s1 = null;
		
		Test.R r2 = null;	//outerClass.innerClass
		Test.S s2 = null;
		
		Test.R r3 = new Test().new R();
		Test.S s3 = new Test.S();//static members should be access through class name. new keyword is for S not for Test
		
		System.out.println("done");
	}
}


