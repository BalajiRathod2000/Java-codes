package com.dataStructure.ArrayList;

import java.util.*;

public class priorityQueue 
{

	public static void main(String[] args) 
	{
		Queue q2=new PriorityQueue();  //it is not follow First In First Out(FIFO)
		
		q2.add(10);
		q2.add(40);
		q2.add(60);
		q2.add(50);
		q2.add(20);
		q2.add(30);
		
		while(!q2.isEmpty())
		{
			System.out.println(q2.poll());
		}
		
	}

}


// output :- 10
//			 20
// 			 30
// 			 40
// 			 50
// 			 60




