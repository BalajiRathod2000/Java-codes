package autoIdgenerate;

import java.util.Scanner;  // satya's program

class Theatre
{
	int seats=50;
	static Theatre t=null;
	
	public Theatre()
	{
		
	}
	
	public static Theatre getinstance()
	{
		if(t==null)t=new Theatre();
		return t;
	}
	public void resrveseat(int numseats)
	{
		
		if(numseats>seats)
		{
			System.out.println(numseats+"seats not avaliable");
			System.out.println(seats+"seats are avaliable");
			return;
		}
		seats=seats-numseats;
		System.out.println(numseats+" no of seats are booked");
		System.out.println("Thank u for booking with us");
		System.out.println(seats+" no of seats are avaliable");
	}
}

class booking
{
	public void book4tickets()
	{
		
		System.out.println("How many tickets do u want: ");
		Scanner sc=new Scanner(System.in);
		int tickets=sc.nextInt();
		
		Theatre theater=Theatre.getinstance();
		theater.resrveseat(tickets);
	}
}
public class SingleTonTest 
{

	public static void main(String[] args) 
	{
		
		booking cos1=new booking();
		cos1.book4tickets();
		
		booking cos2=new booking();
		cos2.book4tickets();
		
		booking cos3=new booking();
		cos3.book4tickets();
		
	}

}
