package com.StringProgram.pack;

public class ReverseTest 
{

	public static void main(String[] args) 
	{
	
		String s="java";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch= s.charAt(i);
			System.out.print(ch);
		}
	}

}


// output:- avaj
