package pack1;
class G
{
	int i, j;
	G(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		
		return "i = " + i + "j = " + j;
	}
	@Override
	public boolean equals(Object obj) {
		
		return i == ((G)obj).i && j == ((G)obj).j;
	}
}
public class M7 {
	public static void main(String[] args) {
		G g1 = new G(10, 20);
		G g2 = new G(10, 20);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g1.equals(g2));
	}
}
