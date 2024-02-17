package com.StringProgram.pack;

public class ReverseSplitString
{

	public static void main(String[] args)
	{
     String s="java is oop lang";
     String res=" ";
     String[] pri=s.split(" ");
     for(int i=0; i<pri.length; i++)
     {
    	 res=res+" "+swap(pri[i]);
     }
     System.out.println(res.trim());
	}
	public static String swap(String s)
	{
		char[] a=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}
}

// output:- avaj si poo gnal

