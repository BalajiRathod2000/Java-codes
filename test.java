package com.StringProgram.pack;

public class test 
{
// public static void main(String[] args) 
//	{
//	  System.out.println(reverse(" i love bala"))
//	}
//      String Stringreverse(String s);
//	  
//	  {
//		  string s1 =" ";
//		  
//		  for(int i=s.length-1;i>=0;i++)
//	  
//	     { 
//	    	 s1 + = s.charAt(i);
//	     }
//	  }

	
	public static void main(String[] args)
	{
        String s="java is oop lang";
        String res=" ";
        String[] a=s.split(" ");
        
        for(int i=a.length-1; i>=0;i--)
        { 
        	res=res+" "+a[i];
        }
        System.out.println(res.trim());
	}

}
	
	
	
// lang oop is java

