package com.StringProgram.pack;

public class PanagramTest 
{

	public static void main(String[] args) 
	{
		
		String s="the quick brown fox jumps over the lazy dog";
	   System.out.println(isPanagram(s));	
	}

	public static boolean isPanagram(String s)
	{
		 	s=s.toLowerCase();
		 	if(s.length()<26)
		 		return false;
		 	else
		 	{
		 		for(char ch='a';ch<='z';ch++)
		 		{
		 			if(s.indexOf(ch)<0)
		 				return false;
		 		}
		 		return true;
		 	}
	}
}

// output:- true


