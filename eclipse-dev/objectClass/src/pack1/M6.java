package pack1;
class F
{
	int i;
	F(int i)
	{
		this.i = i;
	}
	
	@Override
	public String toString() {
		return "i = " + i;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return i == ((F)obj).i;
	}
}
public class M6 {
	public static void main(String[] args) {
		F f1 = new F(90);
		F f2 = new F(90);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.equals(f2));
	}
}
//override the equals method
//we compared based on content