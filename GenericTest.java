package com.dataStructure.ArrayList;

class Generic<T>
{
	void m1(T e)
	{
		System.out.println("Balaji");
		
	}
}

public class GenericTest 
{

	public static void main(String[] args) 
	{
		Generic<Integer> a=new Generic<Integer>();
		a.m1(10);  // Balaji
		
		Generic<String> s=new Generic<String>();
		s.m1("Rathod"); // Balaji
		
	}

}


//output:- Balaji
//		   Balaji