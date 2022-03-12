package pack2;

public class M4 {

	public static void main(String[] args) {
		//B b = new B();
		B b = new B()
				{
					@Override
					void test2() 
					{
							System.out.println("AIC-test2");	
					}
				};
				
		b.test1();
		b.test2();
		
//		B b1 = new B()
//		{
//			@Override
//			void test1() 
//			{
//					System.out.println("AIC-test2");	
//			}
//		};
		
		
		System.out.println("done ...");
	}
}

//	anonymous inner class should not be abstract. 
