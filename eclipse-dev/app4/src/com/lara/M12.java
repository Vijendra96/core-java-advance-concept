package com.lara;

import java.util.Scanner;

public class M12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("enter the array size ...");
		n = in.nextInt();
		int[] array = new int[n];
		System.out.println("enter the elements of array one by one ...");
		for (int i = 0; i < n; i++) 
		{
			array[i] = in.nextInt();
		}
		boolean result = isSorted(array);
		if(result)
		{
			System.out.println("Yes, it is sorted..");
		}else
		{
			System.out.println("No, it is not sorted..");
		}
	}
	public static boolean isSorted(int[] t)
	{
		int n = t.length;
		for(int i = 1; i < n; i++)
		{
			if(t[i] < t[i - 1])
			{
				return false;
			}
		}
		return true;
	}
}
