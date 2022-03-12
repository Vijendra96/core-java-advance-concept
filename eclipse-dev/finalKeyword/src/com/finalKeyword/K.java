package com.finalKeyword;

public class K {
	
	final int a;
	
	K(int a)
	{
		//a = a;
		this.a = a;	//global variable is now got modify
	}
	
	public static void main(String[] args) {
		
	}
}


//local a assigning to local a, it is not possible at line number 9.