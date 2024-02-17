package com.dataStructure.pack;

public class LinkedList 
{

	private Node first=null;
	
	public void add(Object e)
	{
		if(first == null)
		{
			first = new Node(e, null);
			return;
		}
		
		Node curr = first;
		while(curr!=null)
		{
			curr = curr.next;
		}
		curr.next = new Node(e,null);
	}
	
}
