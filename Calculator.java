package autoIdgenerate;

import java.util.Scanner;


public class Calculator 
{

	public static void main(String[] args) 
	{

		int cal;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter 1st numbers... ");
		
		int n1 = sc.nextInt();
		System.out.println(" Enter 2nd numbers... ");
		int n2 = sc.nextInt();
		
		System.out.println(" Select Operation");
		System.out.println(" For Addition (+) Press 1.");
		System.out.println(" For Subtraction (-) Press 2.");
		System.out.println(" For Multiplication (x) Press 3.");
		System.out.println(" For Devision (/) Press 4.");
		System.out.println(" For Remainder (%) Press 5.");
		
		int ch=sc.nextInt();
		
		
		while( true ) 
		{
		
			if(ch==1)
			{
				cal=n1+n2;
				System.out.println(" Addtion  "+n1+ " + " +n2+ " = " +cal);
				break;
				
			}
			else if(ch==2)
			{
				cal=n1-n2;
				System.out.println(" Subtraction "+n1+ " - "+n2+" = "+cal);
				break;
			}
			else if(ch==3)
			{
				cal=n1*n2;
				System.out.println(" Multiplication " +n1+ " X " +n2+ " = " +cal);
				break;
			}
			else if(ch==4)
			{
				cal=n1/n2;
				System.out.println(" Devision " +n1+" / " +n2+" = "+cal);
				break;
			}
			
			else
			{
				cal=n1%n2;
				System.out.println(" Remainder " +n1+" % " +n2+ " = " +cal);
				break;
			}	
		}
	}
}
