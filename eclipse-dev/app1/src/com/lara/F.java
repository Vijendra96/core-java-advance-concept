package com.lara;
//lines count
import java.io.BufferedReader;
import java.io.FileReader;

public class F {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("persons.txt");
		BufferedReader bin = new BufferedReader(fin);
		int linesCount = 0;
		String s1 = bin.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			linesCount ++;
			s1 = bin.readLine();
		}
		System.out.println("Lines count : " + linesCount);
	}
}
