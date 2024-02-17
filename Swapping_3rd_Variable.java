package com.Swap.pack;

import java.util.Scanner;

public class Swapping_3rd_Variable 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt() ;
		
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt() ;
		
		System.out.println("Enter 3rd number");
		int num3 = sc.nextInt() ;
		
		System.out.println("Before swapping "+"num1="+num1+" , "+"num2="+num2+" , "+"num3="+num3);
		
	  // swapping logics
		
		  int temp = num1 ; 
		  num1 = num2 ;
		  num2 = num3 ;
		  num3 = temp ;
		
		System.out.println("After Swapping "+"num1="+num1+" , "+"num2="+num2+" , "+"num3="+num3);
	}
	
}



