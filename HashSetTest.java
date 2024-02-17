package com.dataStructure.ArrayList;

import java.util.HashSet;

public class HashSetTest 
{

	@SuppressWarnings({ "unchecked", "rawtypes", "removal" })
	public static void main(String[] args) 	
	{
	
		HashSet hs=new HashSet();
		hs.add(new Integer(20));
		hs.add(10);   // this 10 is ignored
		hs.add(33);
		hs.add(21);
		hs.add(32);
		hs.add(10);	 // after filling 10 values
		hs.add("Balaji");
		
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
	}

}


// output:-   32
//			  33
//   		  20
//			  21
//			  10
//			  Balaji







