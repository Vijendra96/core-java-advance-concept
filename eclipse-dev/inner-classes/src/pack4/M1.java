package pack4;

class Test implements A
{
	public void test1()
	{
		System.out.println("from test");
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A()
				{
					public void test1() 
					{
						System.out.println("from AIC");	
					}
				};
		
		//one statement implementation
		A a2 = () -> System.out.println("from lamda expression");
		
		//multiple statement implementation
		A a3 = () -> {
						System.out.println("from lamda exp");
						System.out.println("from lamda exp");
						System.out.println("from lamda exp");
						System.out.println("from lamda exp");
					 };
					 
		 Test t1 = new Test();
		 t1.test1();
		 
		 Test t2 = new Test();
		 t2.test1();
		 
		 a1.test1();
		 a1.test1();
		 
		 a2.test1();
		 a2.test1();
		 
		 a3.test1();
		 a3.test1();
	}
}
