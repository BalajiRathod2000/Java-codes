package com.dataStructure.pack;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add(30);
		a.add(0, 40);
		a.add(1, 50);
		a.remove(1);
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}

}
