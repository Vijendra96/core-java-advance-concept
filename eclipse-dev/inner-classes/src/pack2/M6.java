package pack2;

public class M6 {
	public static void main(String[] args) {
		//D d1 = new D();
		
		D d1 = new D()
				{
					public void test1()
					{
						System.out.println("AIC-test1");
					}
					
					public void test2()
					{
						System.out.println("AIC-test2");
					}
				};
				
		d1.test1();
		d1.test2();
	}
}
