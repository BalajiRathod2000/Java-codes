package com.dataStructure.ArrayList;

import java.util.HashMap;

public class HashMapTest 
{

	public static void main(String[] args) 
	{
	
		HashMap<String, Integer> hm=new HashMap<>();
		
		System.out.println(hm.put("balaji",10)); //null
		System.out.println(hm.put("Abhay",60));  //null
		System.out.println(hm.put("Wasim",30));  //null
		System.out.println(hm.put("Vkas",20));   //null
		System.out.println("------------------------------------------ ");
		
		System.out.println(hm.put("balaji",10)); // 10
		System.out.println(hm.put("Abhay",60));  // 60
		System.out.println(hm.put("Wasim",30));  // 30
		System.out.println(hm.put("Vkas",20));   // 20
		System.out.println("------------------------------------------ ");
		
	}

}
