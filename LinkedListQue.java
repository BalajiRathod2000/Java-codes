package com.dataStructure.ArrayList;

import java.util.*;

public class LinkedListQue 
{

	public static void main(String[] args) 
	{
		Queue q=new LinkedList();    // its follows First In First Out(FIFO)
		
		q.add(10);
		q.add(40);
		q.add(60);
		q.add(50);
		q.add(20);
		q.add(30);
		
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
	}

}


// output:-  10
//			 40
//			 60
// 			 50
// 	         20
//			 30


