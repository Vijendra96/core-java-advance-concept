package pack1;
class B
{
	int i;
	B(int i)
	{
		this.i = i;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(90);
		System.out.println(b1);
		
		String s1 = b1.toString();
		System.out.println(s1);
		
		String s2 = "address : " + b1;
		System.out.println(s2);
	}
}


//while printing a reference variable, object toString method is calling.
//it is calling object reference representation