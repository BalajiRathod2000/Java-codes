
package com.StringProgram.pack;

public class StringNumberSum 
{

	public static void main(String[] args) 
	{
				
		String s="12po32ui3yu"; // only number addition 
		
		int sum=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+ch-'0';
				
			}
		}
		System.out.println(sum);
	}
		
}

// output:-  11 

