package pack2;

public class M5 {
	public static void main(String[] args) {
		C c1 = new C()
				{
					{
						System.out.println("C-IIB");
					}
				};
		System.out.println("---------------");
		
		C c2 = new C(90)
				{
					{
						System.out.println("C-IIB");
					}
				};
				
		System.out.println("done ...");
	}
}

//we can not develop a constructer in the anonymous inner class
