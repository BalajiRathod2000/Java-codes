package com.ArrayProgram.pack;

public class countEvenOdd 
{

	public static void main(String[] args) 
	{

        int[]a= {2,4,3,6,5,8,7};
        String even="";
        String odd="";
       
        for(int i=0; i<a.length; i++)
        {
        	if(a[i]%2==0)
        		even=even+a[i];
        }
        System.out.println("Even num = "+even);
        
//----------------------------------------------------------------------------------
        
        for(int i=0; i<a.length; i++)
        {
        	if(a[i]%2!=0)
        	odd=odd+a[i];
        }
        System.out.println("Odd num = "+odd);
        
	}
	

}


// output:- Even num = 2468
//			Odd num = 357



