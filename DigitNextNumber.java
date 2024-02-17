package com.ArrayProgram.pack;

public class DigitNextNumber 
{

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40}; 
		
		for(int i=0; i<a.length; i++) // for loop
		{
			a[i]++;
		}
		
		for(int nextNum : a) // for each loop
		{
			System.out.println(nextNum);
		}
	}
}

// output:- 11
//			21
//			31
//			41



