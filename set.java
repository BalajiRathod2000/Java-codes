package com.setImplmenet.pack;

public class set 
{

	private Node[] a=new Node[10];
	private int count=0;
	
// -----------------------------------------------------------------------------------------------------------
	
	public boolean add(int key)
	{
		 int  index =key % a.length;
		 if(a[index] == null)
		 {
			a[index] = new Node(key, null);
			count++;
			return true;
		 }
		 
		 Node  curr=a[index];
		 Node prev=null;
		 
		 while(curr != null)
		 {
			 if(key == curr.key) return false;
			 prev = curr;
			 curr = curr.next;
		 }
		 
		 prev.next = new Node(key, null);
		 count++;
		 return true;
		 
	}
// -----------------------------------------------------------------------------------------------------------
	
	public int size()
	{
		return count;
	}
//------------------------------------------------------------------------------------------------------------
	public void display()
	{
		for(int i=1; i<a.length; i++)
		{
			Node curr=a[i];
			
			while(curr != null)
			{
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
}
