package pack4;
interface C
{
	void test(int i, int j);
}
public class M3 {
	public static void main(String[] args) {
		C c1 = (i, j) -> System.out.println("from test : "+ i + ", " + j);
		
		C c2 = (a, b) -> System.out.println("from test : "+ a + ", " + b);
		c1.test(10, 20);
		c2.test(40, 50);
	}
}

//