package pack1;
class D
{
	int i, j;
	String s1, s2;
	double m, n;
	boolean flag, isStatus;
	public D(int i, int j, String s1, String s2, double m, double n, boolean flag, boolean isStatus) {
		super();
		this.i = i;
		this.j = j;
		this.s1 = s1;
		this.s2 = s2;
		this.m = m;
		this.n = n;
		this.flag = flag;
		this.isStatus = isStatus;
	}
	@Override
	public String toString() {
		return "D [i=" + i + ", j=" + j + ", s1=" + s1 + ", s2=" + s2 + ", m=" + m + ", n=" + n + ", flag=" + flag
				+ ", isStatus=" + isStatus + "]";
	}
	
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10, 20, "abc", "xyz", 0.9, 6.0, false, true);
		System.out.println(d1);
	}
}
