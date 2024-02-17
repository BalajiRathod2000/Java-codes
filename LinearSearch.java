package com.ArrayProgram.pack;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[] = {2,4,6,7,8,9,};
		
		System.out.println(Search(a, 4));
		System.out.println(Search(a, 2));
		System.out.println(Search(a, 7));
	}

	public static int Search(int a[], int s)
	{
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == s)
			return i;
			
		}
		return -1;
	}
}

// output:- 1
//			0
// 			3


