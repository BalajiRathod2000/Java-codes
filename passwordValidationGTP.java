package com.string.pack;

import java.util.Scanner;

public class passwordValidationGTP  // pending...
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println(" Enter Password...!");
		String password=scn.nextLine();
		
		if(password.length() < 8)
		{
			System.out.println("Password must be at least 8 characters long.");
		}
		
		else if(!password.matches(".[A-z]."))
		{
			System.out.println(" Password must contain at least one uppercase letter.");
		}
		else if(!password.matches(".[a-z]."))
		{
			System.out.println(" Password must contain at least one lowercase letter.");
		}
		else if(!password.matches(".[0-9]."))
		{
			System.out.println(" Password must contain at least one number..");
		}
		else if(!password.matches(" .[!@#$%^&*]. "))
		{
			System.out.println(" Password must contain at least one special character...");
		}
		
		else
		{
			System.out.println(" password is valid... ");
		}
		
	}

}


//import java.util.Scanner;
//
//public class PasswordValidation {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your password:");
//        String password = scanner.nextLine();
//
//        if (password.length() < 8) {
//            System.out.println("Password must be at least 8 characters long.");
//        } else if (!password.matches(".[A-Z].")) {
//            System.out.println("Password must contain at least one uppercase letter.");
//        } else if (!password.matches(".[a-z].")) {
//            System.out.println("Password must contain at least one lowercase letter.");
//        } else if (!password.matches(".\\d.")) {
//            System.out.println("Password must contain at least one number.");
//        } else {
//            System.out.println("Password is valid.");
//        }
//    }
//}