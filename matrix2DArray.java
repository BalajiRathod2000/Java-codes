package com.string.pack;

import java.util.Scanner;

public class matrix2DArray 
{

	public static void main(String[] args) 
	{
		// taking input from user
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter total number of Rows ");
		int rows=sc.nextInt();
		
		System.out.println(" Enter total number of cols ");
		int cols=sc.nextInt();
		
		
		// 2D array creation
		int [][] matrix= new int [rows][cols];
		
		System.out.println(" Please Enter Matrix Elements...");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				matrix [i][j]= sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				
				System.out.print(matrix [i][j]+ " ");
			}
			
			System.out.println();
		}
		
	}

}
