package com.casting;

public class M2 {
	public static void main(String[] args) {
//		int i = 10;					//you can't assign wider to narrower
//		byte b1 = i;
//		double d1 = b1;
//		float f1 = d1;
		
		
		
		
		
		//Explicitly narrowing
		int i = 10;
		byte b1 = (byte) i;
		double d1 = i;
		float f1 = (float) d1;
		System.out.println("done");
	}
}
