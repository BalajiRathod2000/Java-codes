package com.StringProgram.pack;

public class AnagramTets 
{

	public static void main(String[] args) 
	{
	
	System.out.println(isAnagram("LISTEN" , "SILENT"));
		
	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		
		s1 = s1.toLowerCase() ;
		s2 = s2.toLowerCase() ;
		
		while(s1.length() == s2.length())
		{
			if(s1.length() == 0 && s2.length() == 0)
				return true ;
			
			char c = s1.charAt(0) ;
			s1 = s1.replace(c+"", "") ;
			s2 = s2.replace(c+"", "") ;
			
		}
		
		return false; 
	}
}

// output:- true


