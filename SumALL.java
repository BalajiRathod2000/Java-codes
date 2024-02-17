package com.ArrayProgram.pack;

public class SumALL 
{

	public static void main(String[] args) 
	{
       int[]a= {1,2,3,4};
       int sum=0;
       String res="";
       
       for(int i=0; i<a.length; i++)
       {
    	   sum=sum+a[i];
    	   res=res+a[i];
    	   if(i<a.length-1)
    		   res=res+"+";
       }
       System.out.println(res+"="+sum);
	}

}

//output:-  1+2+3+4=10
