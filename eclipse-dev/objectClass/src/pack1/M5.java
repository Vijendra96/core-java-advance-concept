package pack1;
class E
{
	int i;
	E(int i)
	{
		this.i = i;
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(90);
		E e2 = new E(90);
		E e3 = e1;
		E e4 = e2;
		System.out.println(e1 == e2);
		System.out.println(e1 == e3);
		System.out.println(e1 == e4);
		System.out.println(e2 == e3);
		System.out.println(e2 == e4);
		System.out.println("==================");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e2.equals(e3));
		System.out.println(e2.equals(e4));
	}
}

//	object class equals method using internally equals operator
//	== operator checking memory location only.
//	equals() method checking content only.