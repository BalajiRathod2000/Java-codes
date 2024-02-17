package com.string.pack;

public class linearSearchTest 
{

	public static void main(String[] args) 
	{
		int [] a= {4,7,5,8,1,7};
		
		System.out.println(search(a, 1));
		System.out.println(search(a, 6));
	}
	
	public static int search(int[] a,int s)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i] ==s ) return i;
		}
		return -1;
	}

}
