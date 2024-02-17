package com.dataStructure.ArrayList;

import java.util.ArrayList;

public class ArrayListDrive 
{


	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20.0);	 	// double values
		a1.add(10);      	// Duplicate values
		a1.add("Balaji");  	// String values	
		a1.add(30);  		
		a1.add(true);		// removed
		a1.remove(5);  	    // removing 50 value from method
		//a1.isEmpty(); 	// comparing any empty method is present or not
		//a1.clear();    	// clear all values ---> []
		
		System.out.println(a1);   // [10, 20.0, 10, Balaji, 30]

	}

}
