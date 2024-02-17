package com.StringProgram.pack;

public class letterCount 
{

	public static void main(String[] args) 
	{

		String s="malayalam";
		
		while(s.length()>0)
		{
			char ch=s.charAt(0);
			String res = s.replace(ch+"", "");
			
			int count=s.length()-res.length();
			
			System.out.println(ch+ " = " +count );
			s=res;
		}
	}

}


// output:-   m = 2
//			  a = 4
//			  l = 2
// 			  y = 1

