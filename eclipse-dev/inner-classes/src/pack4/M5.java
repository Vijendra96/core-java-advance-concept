package pack4;
interface D
{
	int test();
}
public class M5 {
	public static void main(String[] args) {
		D d1 = () -> 100;
		System.out.println(d1.test());
		
		
		//for multiple statement
		D d2 = () ->{
			System.out.println("from test");
			return 200;
		};
		System.out.println(d2.test());
		
		method1(() -> 2000);
	}
	static void method1(D obj)
	{
		System.out.println("from test : " + obj.test());
	}
}
