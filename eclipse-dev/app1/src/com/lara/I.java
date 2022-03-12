package com.lara;
//read record into object and then store object into container
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class I {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("persons.txt");
		BufferedReader bin = new BufferedReader(fin);
		Person person;
		ArrayList list = new ArrayList();
		String s1 = bin.readLine();
		String[] words;
		while(s1 != null)
		{
			person = new Person();  //ramesh b 38 BTM
			words = s1.split(" ");
			person.firstName = words[0];
			person.lastName = words[1];
			person.age = Integer.parseInt(words[2]);
			person.address = words[3];
			list.add(person);
			s1 = bin.readLine();
		}
		//read person object from an ArrayList
		for(Object obj : list)
		{
			person = (Person) obj;
			System.out.println(person.firstName + ", " + person.lastName + ", " + person.age + ", " + person.address);
		}
	}
}
