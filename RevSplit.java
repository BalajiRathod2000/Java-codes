package com.StringProgram.pack;

public class RevSplit {

	public static void main(String[] args)
	{
        String s="java is oop lang";
        String res=" ";
        String[] a=s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        { 
        	res=res+" "+a[i];
        }
        System.out.println(res.trim());
	}

}


// output:- lang oop is java
