package com.setImplmenet.pack;

public class SetTest 
{

	public static void main(String[] args) 
	{
		
		set s=new set();
		
		System.out.println(s.add(46));
		System.out.println(s.add(53));
		System.out.println(s.add(67));
		System.out.println(s.add(46));
		System.out.println(s.add(46));
		System.out.println(s.add(43));
		
		System.out.println(" Size = "+ s.size());
		s.display();
	}

}
