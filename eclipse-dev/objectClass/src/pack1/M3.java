package pack1;
class C
{
	int i;
	C(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(10);
		System.out.println(c1);
	}
}

//toString method 
