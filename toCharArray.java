package com.string.pack;

public class toCharArray 
{

	public static void main(String[] args) 
	{
		
		String s1="Balaji";
		
// 		char[Balaji] ---> a (values of Array stored in a reference		
		
		char[] a=s1.toCharArray();
		
		for(char ch: a) 
		{
			
		System.out.println(ch);	
		
		}
	}

}

// Output:- B
//			a
//			l
//			a
//			j
//			i
