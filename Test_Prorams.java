package com.StringProgram.pack;

public class Test_Prorams 
{

	public static void main(String[] args) 
	{
	
		String s = "Balaji" ;
		s = s.toLowerCase() ;
		
		while(s.length() > 0)
		{
			char ch = s.charAt(0) ;
			String res = s.replace(ch+"", "") ;
			int count = s.length() - res.length() ;
			System.out.println(ch+ " = " +count);
			s=res ;
			
		}
		
	}
}
