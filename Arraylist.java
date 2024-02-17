package com.dataStructure.ArrayList;

public class Arraylist 
{

	private Node first=null; //pending
	private int count = 0;
	
	public void add(Object e)
	{
		if(first == null)
		{
			first = new Node(e, null);
			count++;
			return;
		}
		
		Node curr=first;
		
		while(curr.next!= null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
	}
	
	public void add(int index, Object e)
	{
		if(index <= -1 || index >= size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0)
		{
			first = new Node(e, first);
			count ++;
			return;
		}
		
		
		Node curr=first;
		
		for(int i=1; i<=index; i++)
		{
			curr = curr.next;
		}
		curr.next = new Node(e, curr.next);
		      count++;
	}
	
	public void remove(int index, Object e)
	{
		if(index <= -1 || index >= size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0)
		{
			first = first.next;
			count--;
			return;
		}
		
		Node curr = first;
		
		for(int i=1; i<=index; i++)
		{
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
		
	}

	int size() 
	{
		return count;
	}
}
