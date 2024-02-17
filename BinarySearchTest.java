package com.string.pack;

public class BinarySearchTest 
{

	public static void main(String[] args) 
	{
		int [] a= {3,5,7,8,9};
		
		System.out.println(search(a, 4));// 4
		System.out.println(search(a, 2));// 4
		
	}
	
	public static int search(int [] a, int x)
	{
		int start=0, end=a.length-1;
		
		while(start>=end)
		{
			int mid=(start+end)/2;
			if(x==a[mid]) return mid;
			else if(x<a[mid]) end=mid-1;
			
			else start=mid +1;
		}
		return end;
	}

}
