package com.dataStructure.pack;

public class ArrayList                // pending 
 {

	private Object [] a;
	private int p;
	
	public ArrayList()
	{
		a=new Object [5];
		p=0;
	}
	
	public void add(Object e)
	{
		
		if(p>=a.length)   increasesize();
		a[p++] =e;
	}
	
	public void add(int index, Object e)
	{
		if(index <= 1 || index >= size());
		{
			throw new IndexOutOfBoundsException();
		}
	}
	
	private void increasesize()
	{
		Object [] temp = new Object[a.length+3];
		
		for(int i=0; i<a.length; i++)
		{
			temp [i] = a[i];
		}
		  	a=temp;
	}
		
	public int size()
	{
		return p;
	}
	
	public Object get(int index)
	{
		if(index <= -1 || index >=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a [index];
	}
		
	public void remove(int index)
	{
		if(index <=-1 || index >= size())
		{
			throw new IndexOutOfBoundsException();
		}
		
	}
}
