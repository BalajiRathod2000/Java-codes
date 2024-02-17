package com.string.pack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordValidation 
{

	public static void main(String[] args)  // pending... 
	{
		String exp=(("?=.*[!@#$%^&*+_-])(?=.*[A-z])(?=.*[0-9](?=.*[a-b]).{5-10}"));
		String str="Balaji@23";
		Pattern p=Pattern.compile(exp);
		Matcher m= p.matcher(str);
		System.out.println(m.matches());
	}

}
