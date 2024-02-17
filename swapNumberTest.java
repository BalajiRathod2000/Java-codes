package com.string.pack;

import java.util.Scanner;

public class swapNumberTest 
{

	public static void main(String[] args) 
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println(" Enter 1st number to swap  ");
		int swap=scn.nextInt();
		
		System.out.println(" Enter 2nd number to swap  ");
		int antiswap=scn.nextInt();
		
		int temp;
		System.out.println(" Original 1st numbers.. "+swap);
		System.out.println(" Original 2nd numbers.. "+antiswap);
		System.out.println(" =======================================");
		
		temp = swap;
		swap = antiswap;
		antiswap = temp;
		
		System.out.println(" swaped 2nd numbers... " +swap);
		System.out.println(" swaped 1st numbers... "+antiswap);
		
		
		
	}

}


//int a=10;
//int b=20;
//int temp;
//System.out.println(" Before swap ");
//System.out.println(" a = "+a);
//System.out.println(" b = "+b);
//
//temp = a;
//a = b;
//b = temp;
//
//System.out.println(" After swaped ");
//System.out.println(" a = "+a);
//System.out.println(" b = "+b);