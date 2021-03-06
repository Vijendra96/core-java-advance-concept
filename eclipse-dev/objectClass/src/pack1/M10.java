package pack1;
class J
{
	int a, b;
	J(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	@Override
	public int hashCode() {
		int hash = Integer.toString(a).hashCode();
		hash += Integer.toString(b).hashCode();
		return hash;
	}
}
public class M10 {
	public static void main(String[] args) {
		J j1 = new J(1000, 2020);
		J j2 = new J(1000, 2020);
		J j3 = new J(2020, 1000);
		J j4 = new J(999, 56656);
		
		System.out.println(j1.hashCode());
		System.out.println(j2.hashCode());
		System.out.println(j3.hashCode());
		System.out.println(j4.hashCode());
	}
}

// hashCode is generating based on the attribute values a and b.
// if hash numbers are varying, content are varying.
// if two object having same hashCode then content may be same(j1 and j2), may not be same(j1 and j3).
// if two object hashCode is same, then content is also same.

//hashCode means inequality.
//equals() means equality. 