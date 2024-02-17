package com.dataStructure.ArrayList;

public class ArrayListTest 
{

	public static void main(String[] args) 
	{

		Arraylist al = new Arraylist();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i=0; i<=al.size(); i++)
		{
			System.out.println(al);
		}
	}

}
