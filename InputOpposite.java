package com.StringProgram.pack;

public class InputOpposite
{

	public static void main(String[] args)
	{
         String s="BalaJi";
         String res="";
         for(int i=0;i<s.length();i++)
         {
        	 char ch=s.charAt(i);
        	 if(Character.isLowerCase(ch))
        	 {
        		 res=res+Character.toUpperCase(ch);
        	 }
        	 if(Character.isUpperCase(ch))
        	 {
        		 res=res+Character.toLowerCase(ch);
        	 }
         }
         System.out.println(res);
	}
	

}

//output:- bALAjI
