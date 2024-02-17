package com.ArrayProgram.pack;

public class ArraySum 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		String res="";
		
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i]; // 1+2+3+4+5+6=21
			res=res+a[i];
			
			if(i<a.length-1)
				res=res+"+";
			
		}
		
		System.out.println(res+ "=" +sum);
	}
}

// output:- 1+2+3+4+5+6=21

