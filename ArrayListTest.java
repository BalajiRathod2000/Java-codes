package com.dataStructure.pack;

import java.util.ArrayList;

public class ArrayListTest 
{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
	
		a1.add(10);
		a1.add("String");
		a1.add(10.5);
		a1.add(true);
		a1.add(10);
		a1.remove(1);
		
		System.out.println(a1); // output :- [10, 10.5, true, 10]
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));  
		}
	}
}


// output:-     //  10
				//	10.5
				//  true
				//  10