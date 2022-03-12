package com.lara;
//count the characters in a string with a space and without a space
import java.io.BufferedReader;
import java.io.FileReader;

public class H {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("persons.txt");
		BufferedReader bin = new BufferedReader(fin);
		int charsCount = 0;
		int charsCountWithoutSpace = 0;
		String s1 = bin.readLine();
		while(s1 != null)
		{
			charsCount += s1.length();
			for (String word : s1.split(" ")) 
			{
				charsCountWithoutSpace += word.length();
			}
			s1 = bin.readLine();
		}
		System.out.println("all chars count : " + charsCount);
		System.out.println("all the chars without space : " + charsCountWithoutSpace);
	}
}
