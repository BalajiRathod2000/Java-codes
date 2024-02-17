package com.StringProgram.pack;

public class StringTest 
{

	public static void main(String[] args)
	{
        String s="java is easy";
        String[] a=s.split(" ");
        for(String str:a)
        {
        	System.out.println(str);
        }
	}
}


// output:- java
//			is
//			easy