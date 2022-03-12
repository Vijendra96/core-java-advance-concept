package pack4;
interface B{
	void test(int i);
}
public class M2 {
	public static void main(String[] args) {
		B b1 = (int i) -> System.out.println("from test : " + i);
		
		B b2 = (i) -> System.out.println("from test : " + i);
		
		B b3 = (a) -> {
			System.out.println("from test : " + a);
			System.out.println("from test : " + a);
		};
		
		b1.test(10);
		System.out.println("-----------------");
		b2.test(20);
		System.out.println("-----------------");
		b3.test(1000);
	}
}
