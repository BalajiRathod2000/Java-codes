package autoIdgenerate;

import java.util.Scanner;

interface customer
{
	void input();   // public + abstract
	void output();  // public + abstract
}

class developer implements customer
{
	String phoneName;
	String ram;
	double price;
	
	
	@Override
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Phone Name ");
		phoneName=sc.nextLine();
		
		System.out.println(" Available:- 4GB, 6GB, 8GB, 12GB ");
		System.out.println(" Which RAM  You Want");
		ram=sc.nextLine();
		
		System.out.println(" RAM :-  4GB,   6GB,   8GB,   12GB");
		System.out.println("Pirce:-  10999, 15999, 22999, 50999");
		
		System.out.println(" Enter Price... ");
		price=sc.nextDouble();
		
		
		if(price==10999)
		{
			System.out.println(" Congratulations ... 👍🏻 ");
		}
		else if(price==15999)
		{
			System.out.println("Congratulations ... 👍🏻  ");
		}
		else if(price==22999)
		{
			System.out.println("Congratulations ... 👍🏻  ");
		}
		else if(price==50999)
		{
			System.out.println("Congratulations ... 👍🏻  ");
		}
		else
			System.out.println(price+ " Not Available Phones");
	}

	@Override
	public void output() 
	{
		System.out.println(" Phone Name:- " +phoneName);
	}
	
}

public class implementationTest 
{
	public static void main(String[] args) 
	{
		customer c=new developer();
		c.input();
		System.out.println(" ======================================= ");
		c.output();
	}

}
