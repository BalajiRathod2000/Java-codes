package com.AdvanceJava.pack;

class A
{
	 int i;
	
	A(int i)  // this is constructor
	{
		this.i=i;
	}
	
	// inner class
	class B
	{
		public void m1()
		{
			System.out.println("i = "+i);
		}
	}
}

public class OuterclassTest {

	public static void main(String[] args) 
	{
		
		A a=new A(20);  /// object created for A class (outerClass)
		A a1=new A(30);
		
		A.B b=a.new B(); // object created  for B class(InnerClass) with reference of A class(outerClass)
		A.B b1=a1.new B(); 
		
		b.m1();  // calling m1() (method) with reference of innerClass 
		b1.m1();
		
	}

}


// output:- i = 20
// 			i = 30

