package com.stringLogical;
//develop the logic for sorting (bubble sort)

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		int[] elements = {5, 3, 10, 2, 8, 1, 6, 0, 7};
		System.out.println(Arrays.toString(elements));
		
		int temp;
		for(int i = 0; i < elements.length; i++)
		{
			for(int j = 0; j < elements.length - 1 - i; j++)
			{
				if(elements[j] > elements[j + 1])
				{
					temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(elements));
	}
}