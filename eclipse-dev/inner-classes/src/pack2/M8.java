package pack2;

public class M8 {
	static A method1()
	{
		return new A();
	}
	static A method2()
	{
		return new A()
				{
					void test1()
					{
						System.out.println("AIC-test1");
					}
				};
	}
	
	static A method3()
	{
		return new A()
				{
					void test1()
					{
						System.out.println("AIC-test1");
					}
					void test2()
					{
						System.out.println("AIC-test2");
					}
				};
	}
	
	public static void main(String[] args) {
		A a1 = method1();
		a1.test1();
		a1.test2();
		System.out.println("----------------");
		
		A a2 = method2();
		a2.test1();
		a2.test2();
		
System.out.println("----------------");
		
		A a3 = method3();
		a3.test1();
		a3.test2();
	}
}
