package com.StreamJava8feature.pack;

public class AnonymousTest 
{

	public static void main(String[] args) 
	{
		
//	
//		Anonymous ano=new Anonymous()
//		{
//			public void show()
//			{
//				System.out.println("Anonymous Interface,show method implimentaion...!");
//			}
//			
//			
//			public void numPrint(int a)
//			{
//				System.out.println(a);
//			}
//		};
//		
//		ano.show(); // show method calling
//		ano.numPrint(45); // numPrint  method calling
		
//---------------------------------------------------------------------------------------	
		Anonymous lambda=() -> System.out.println("this is lambda expression.. ");
		
			
		lambda.show();
				
	}

}
