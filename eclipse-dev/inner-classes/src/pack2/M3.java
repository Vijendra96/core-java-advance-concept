package pack2;

public class M3 {

	public static void main(String[] args) {
		A a1 = new A()
				{
					void test1()
					{
						System.out.println("modified test1");
						test3();
					}
					void test3()
					{
						System.out.println("from test3");
					}
				};
				
		a1.test1();
		a1.test2();
		//a1.test3();

	}

}
