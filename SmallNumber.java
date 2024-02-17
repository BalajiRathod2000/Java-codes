package com.ArrayProgram.pack;

public class SmallNumber {

	public static void main(String[] args) 
	{
	
         int[]a= {3,1,2,4};
         int small=a[0];
         
         for(int i=0; i<a.length; i++)
         {
        	 if(a[i]<small)
        		 small=a[i];
         }
         
         System.out.println("Small number = "+small);
	}

}

//output:- Small number = 1
