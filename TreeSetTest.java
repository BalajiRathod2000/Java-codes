package com.setImplmenet.pack;

import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetTest 
{

	public static void main(String[] args)
	{
	
		TreeSet s=new TreeSet( );
		s.add(50);
		s.add(20);
		s.add(60);
		s.add(10);
		s.add(40);
		s.add(30);
	
		SortedSet s1=s.headSet(40);
		
		for(Object res:s1)
		{
			System.out.print(res+ " ");
		}
		System.out.println();
		
		
		SortedSet s2=s.tailSet(40);
		
		for(Object o:s2)
		{
			System.out.print(o+ " ");
		}
		System.out.println();
	}

}
