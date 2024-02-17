package autoIdgenerate;

class MyTread1 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i<4000)
		{
			System.out.println(" MyTread1 is cooking ...! ");
			System.out.println(" I am happy... ");
			i++;
		}
	}
}

// ==========================================================================================

class MyTread2 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i<4000) 
		{
			System.out.println(" MyTread2 is chatting ...!");
			System.out.println(" I am sad ... ");
			i++;
		}
	}
}

//==========================================================================================

public class multiThreadTest 
{

	public static void main(String[] args) 
	{
		MyTread1 t1=new MyTread1();
		t1.start();  // method 
		
		MyTread2 t2=new MyTread2();
		t2.start(); // method 
	}

}
