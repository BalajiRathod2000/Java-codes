package com.AdvanceJava.pack;

class OuterClass
{

	static int i=10;
	
	// Nested class 
	
	static class NestedInnerClass
	{
		static int j=50;
		
		public void NestedMethod()
		{
			System.out.println("This is NestedInnerClass Method");
			System.out.println("i = "+i);
		}
	}
}

public class NestedClassTest 
{

	public static void main(String[] args)
	{
		// taking outerClass name and creating the object for Nested Class 
		OuterClass.NestedInnerClass nes=new OuterClass.NestedInnerClass(); 
		
		nes.NestedMethod(); // method calling with nested Class reference...
	}

}
