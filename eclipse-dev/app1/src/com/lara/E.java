package com.lara;
//read the files
import java.io.BufferedReader;
import java.io.FileReader;

public class E {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("persons.txt");
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
		System.out.println("done");
	}
}
