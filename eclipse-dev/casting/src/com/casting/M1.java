package com.casting;

public class M1 {
	public static void main(String[] args) {
		byte b1 = 100;
		short s1 = b1;
		int i = b1;
		int j = s1;
		long long1 = b1;
		long lon2 = s1;
		long long3 = i;	//long lon3 = (long) i; ====> inside compiler ====>  (auto widening)
		long long4 = j;
		float f1 = j;
		double d1 = b1;
		double d2 = i;
		double d3 = long3;
		double d4 = f1;
		System.out.println("done");
	}
}

//byte < short < int < long < float < double