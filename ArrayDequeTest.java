package com.dataStructure.ArrayList;

import java.util.*;

public class ArrayDequeTest 
{
	
	public static void main(String [] args)
	{
		Queue q1=new ArrayDeque();   // its follows First In First Out(FIFO)
		
		q1.add(10);
		q1.add(40);
		q1.add(60);
		q1.add(50);
		q1.add(20);
		q1.add(30);
		
		while(!q1.isEmpty())
		{
			System.out.println(q1.poll());
		}
	}

}

//  output :-    10
//				 40
//				 60
// 				 50
// 				 20
// 				 30




