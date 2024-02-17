package com.StringProgram.pack;

public class SmalltoBigLetter 
{
	public static void main(String[] args) 
	{
		String s="java is oop lang";  // passing small letter
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

// output:- Java Is Oop Lang	
	