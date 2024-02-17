package com.StreamJava8feature.pack;

import java.util.*;
import java.util.stream.Collectors;

public class foreach 
{
	
	public static void main(String[] args) 
	{
	
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		List<Integer> list2=list.stream().map(e->e*e).collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
	
	
}
