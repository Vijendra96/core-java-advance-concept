package com.lara;
//chars count with space
import java.io.BufferedReader;
import java.io.FileReader;

public class G {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("persons.txt");
		BufferedReader bin = new BufferedReader(fin);
		int wordsCount = 0;
		String s1 = bin.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			wordsCount  += s1.split(" ").length;
			s1 = bin.readLine();
		}
		System.out.println("word count : " + wordsCount);
	}
}
