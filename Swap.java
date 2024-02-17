package com.Swap.pack;

//Swap two number without using 3rd variable

import java.util.Scanner;

//  a=10 	b=20  input
//  a=20    b=10  output

//  (^ -->  XOR)

public class Swap 
{

	public static void main(String[] args) 
	{
	
		
		Scanner scn = new Scanner(System.in) ;
		System.out.println("Enter 1st number"); 
		
		int a = scn.nextInt() ; 
		System.out.println("Enter 2nd number");
		int b = scn.nextInt() ;
		
		System.out.println("Before Swapping "+a+" "+b);
		
		a = a+b ;  //  a = 100+200 = 300  a --> 300 
		b = a-b ;  //  b = 300-200 = 100  b --> 100
		a = a-b ;  //  a = 300-100 = 200  a --> 200
		
		System.out.println("After Swapping "+a+" "+b);
		
	}
}
