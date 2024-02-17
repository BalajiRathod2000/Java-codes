package com.Swap.pack;

import java.util.Scanner;

//Swap two number without using 3rd variable

//a=10 	b=20  input
//a=20    b=10  output


public class Swapping_Number
{

	public static void main(String[] args) 
	{
	    
		
		Scanner scn = new Scanner(System.in) ;
		System.out.println("Enter 1st number"); 
		
		int a = scn.nextInt() ; 
		System.out.println("Enter 2nd number");
		int b = scn.nextInt() ;
		
	      System.out.println("Before swapping: a = " + a + ", b = " + b);

	      a = a ^ b;    //  a = 100+200 = 300  a --> 300 
	      b = a ^ b;    //  b = 300-200 = 100  b --> 100
	      a = a ^ b;    //  a = 300-100 = 200  a --> 200

	     System.out.println("After swapping: a = " + a + ", b = " + b);
	     
	    }
}
