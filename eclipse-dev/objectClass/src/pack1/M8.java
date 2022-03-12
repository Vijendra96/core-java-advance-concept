package pack1;
class H
{
	int a;
	H(int a)
	{
		this.a = a;
	}
}
public class M8 {
	public static void main(String[] args) {
		H h1 = new H(90);
		H h2 = new H(90);
		H h3 = h1;
		H h4 = h2;
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());
		System.out.println(h4.hashCode());
	}
}

//	hashCode available in the object class
//	hashCode = integer representation of the memory address of the object
//	it is only memory address. it is not based on the object.
