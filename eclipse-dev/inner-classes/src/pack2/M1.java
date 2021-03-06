package pack2;

public class M1 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();
		a1.test2();
		
		A a2 = new A()	// no argument constructor
				{ //Anonymous inner class
					void test1()
					{
						System.out.println("modified in test1");
					}
				};
				
		a2.test1();
		a2.test2();
	}
}

// a body without name is called anonymous inner class.
// if current class does not have name, that is why it is called anonymous inner class.
//anonymous inner class only for one object creation.
