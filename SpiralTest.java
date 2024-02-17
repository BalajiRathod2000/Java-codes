package com.string.pack;

public class SpiralTest 
{

	public static void main(String[] args) // error pending...
	{
		int [][] a= spiral(5);
		
		for(int [] temp :a)
		{
			for(int n: temp)
			{
				System.out.print(n+ " ");
			}
				System.out.println();
		}
	}

	public static int[][] spiral(int  size)
	{
		int [][] a=new int [size][size];
		
		char m='r';
		int r=0, c=-1;
		
		for(int i=1; i<size*size; i++)
		{
			switch(m)
			{
			case 'r': c++;
					  a[r][c]=i;
					  if(c==size-1 || a[r][c-1]!=0) m='d';
					  break;
					 
			case 'd' : r++;
					   a[r][c]=i;
					   if(r==size-1 || a[r-1][c]!=0) m='l';
					   break;
					   
			case 'l' : c--;
					   a[r][c]=i;
					   if(c==0 || a[r+1][c]!=0) m='u';
					   break;
					   
			case 'u' : r--;
					   a[r][c]=i;
					   if(a[r-1][c] !=0) m='r';
			}
			
		}
		
		return a;
	}
}
