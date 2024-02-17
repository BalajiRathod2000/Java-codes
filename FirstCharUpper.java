package com.StringProgram.pack;

public class FirstCharUpper 
{

	public static void main(String[] args) 
	{ 
		String s="java is oop lang";
		String res=" ";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			char ch=a[i].charAt(0);
			String upper=String.valueOf(ch).toUpperCase();
			String lower=a[i].substring(1);
			res=res+" "+upper+lower;
		}
		System.out.println(res.trim());
	}

}

// Output :- Java Is Oop Lang

