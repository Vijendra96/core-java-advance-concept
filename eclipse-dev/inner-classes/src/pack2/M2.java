package pack2;

public class M2 {

	public static void main(String[] args) {
		A a1 = new A()
				{
					void test1()
					{
						System.out.println("modified test1");
					}
					void test2()
					{
						System.out.println("modified test2");
					}
				};
				
				
		a1.test1();
		a1.test2();

	}

}
