package com.lara1;

public class G implements F {

	@Override
	public void test1(int i) {
		System.out.println("test1(int)");
	}

	@Override
	public int test2() {
		System.out.println("test2()");
		return 0;
	}
	
	public static void main(String[] args) {
		G g1 = new G();
		g1.test1(100);
		int i = g1.test2();
		System.out.println(i);
	}
	
}
