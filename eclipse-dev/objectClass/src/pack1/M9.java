package pack1;
class I
{
	int a;
	I(int a)
	{
		this.a = a;
	}
	
	
	@Override
	public int hashCode() {
		
		return Integer.toString(a).hashCode(); //	override hashCode() method through toString()
	}
}
public class M9 {
	public static void main(String[] args) {
		I obj1 = new I(90);
		I obj2 = new I(90);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}


