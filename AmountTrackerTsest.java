package com.string.pack;

import java.util.Scanner;

public class AmountTrackerTsest 
{

	public static void main(String[] args) 
	{
		
		long amount=0;
		
		// Menu
		System.out.println(" 🙏🏻 Wel-Come to Balaji ATM 🙏🏻");
		
		System.out.println("                            ");
		
		System.out.println(" Please Select the menu ...!");
		
		System.out.println("                            ");
		System.out.println(" Press A. Check Balance..   ");
		System.out.println(" Press B. Deposite Amount.. ");
		System.out.println(" Press C. Withdraw Amount.. ");
		System.out.println(" Press D. Exit.. ");
		
	
		
		// take user input
		Scanner sc=new Scanner(System.in);
		
// --------------------------------------------------------------------------------------------
		while(true)
		{
			// display to user
			
			String choice= sc.next();
//------------------------------------------------------------------------------------------	
			
			// Check Balance
			if(choice.equalsIgnoreCase("a"))
				System.out.println(" Balance= "+amount+ " rupees");
//------------------------------------------------------------------------------------------
			
			// Deposit section
			  else if(choice.equalsIgnoreCase("b"))
			{
				System.out.println(" Please Enter the amount to deposite ... ");
				int n=sc.nextInt();
				
				 if(n<0)
				{
					System.out.println(" Please Enter the Valid amount ...! 😬 ");
					
				}
				 else {
					
					amount+=n;
					System.out.println(amount+" Amount is successfully deposited... 👍🏻 ");
				} 
			}
			
//-------------------------------------------------------------------------------------------------
			
				// withdraw section
				 else if(choice.equalsIgnoreCase("c"))
				{
					 
					System.out.println(" Please Enter the amount to withdraw... ");
					int w=sc.nextInt();
					
						if(amount<w)
						{
						System.out.println(" Insufficient balance... ☹ ");
						System.out.println("						");
						
						System.out.println(amount+" balance is available in your Account ");
						
						}
						else {
						
						amount=amount-w;
						System.out.println(w+" Amount is successfully Withdraw...👍🏻 ");
						}
				}
//---------------------------------------------------------------------------------------------------
						
					
					// exit section
					else if(choice.equalsIgnoreCase("d"))
					{
						System.out.println(" You want to Exit...! ");
						
						System.out.println(" Press Y ");
						
//---------------------------------------------------------------------------------------------------------						
						
						// exit option 
						String y=sc.next();
						if(y==y)
						{
							System.out.println(" Thank You for using our services ");
							System.out.println(" Visit again... 🤝🏻 ");
							break;
						}
			      }
			}
		}
	}


