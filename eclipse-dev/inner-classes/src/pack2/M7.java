package pack2;

public class M7 {
	public static void main(String[] args) {
		method1(new A());
		System.out.println("--------------------");
		method1(new A()
				{
					void test1()
					{
						System.out.println("AIC-test1");
					}
				});
		System.out.println("--------------------");
		method1(new A()
				{
					void test1()
					{
						System.out.println("AIC-test1");
					}
					void test2()
					{
						System.out.println("AIC-test1");
					}
				});
	}
	static void method1(A a1)
	{
		a1.test1();
		a1.test2();
	}
}
