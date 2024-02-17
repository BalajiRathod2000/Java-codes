package com.dataStructure.ArrayList;

import java.util.HashMap;
import java.util.Set;

public class HashMapAndSetTest 
{

	public static void main(String[] args) 
	{

		HashMap<String, Integer> hm=new HashMap<>();
		
		hm.put("ravi", 10);
		hm.put("Vishnu", 50);
		hm.put("Praksh", 20);
		hm.put("Balaji", 40);
		hm.put("sanvi", 30);
		
		Set<String> s=hm.keySet();
		for(String str:s)
		{
			System.out.println(str+" --> "+hm.get(str));
		}
		
	}

}
