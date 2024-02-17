package com.StringProgram.pack;

public class subStringMethodTest 
{

	public static void main(String[] args) 
	{

		String s1="javadeveloper"; //  (start from 0 -->9 )
		String s2=s1.substring(4); //  developer (java is deleted)

		System.out.println(s2);

	}

}


// output:- developer

// javadeveloper  java is ignored based on index value, 
//      because index start from 0 subString(4)java is deleted...
