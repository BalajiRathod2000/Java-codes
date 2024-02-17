package com.AdvanceJava.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PersonTest 
{

	public static void main(String[] args) {
	    List<Person>list=new ArrayList<>();
			
			list.add(new Person(100, "Balaji", "balaji@gmail.com"));
			list.add(new Person(101, "Rathod", "rathod@gmail.com"));
			list.add(new Person(102, "Bala", "bala@gmail.com"));
			list.add(new Person(103, "Abhay", "abhay@gmail.com"));
			list.add(new Person(104, "Wasim", "wasim@gmail.com"));
			list.add(new Person(105, "Nikhil", "nikhil@gmail.com"));
			list.add(new Person(106, "Vinod", "vinod@gmail.com"));
			list.add(new Person(107, "Bhagwan", "bhagwan@gmail.com"));
			list.add(new Person(108, "Akshaya", "akshaya@gmail.com"));
			list.add(new Person(109, "Satya", "Saty@gmail.com"));
			
			List<Person>list2=list.stream().distinct().collect(Collectors.toList());
			list2.forEach(e->System.out.println(e));
			
		}
}
