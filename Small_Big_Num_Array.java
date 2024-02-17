package com.ArrayProgram.pack;

public class Small_Big_Num_Array 
{

	public static void main(String[] args) 
	{
		int a [] = {2,5,1,6,4,3,8,1,9}; 
		int small = a[0] ;
		int big = a[0] ;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<small)
				small = a[i] ;
		}
		
		System.out.println("Smallest num = "+small);
		System.out.println("----------------------------------");
		
		for(int i=0; i<a.length; i++)
		{
			if(big<a[i])
				big = a[i] ;		
		}
		
		System.out.println("Biggest num = "+big);
	}
}
