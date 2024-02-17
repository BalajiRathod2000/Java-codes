package autoIdgenerate;

class Mythread extends Thread
{
	public void run()
	{
		try {
			
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("child class");
			 Thread.sleep(4000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("iam entering into the sleeping state");
		}
	}
}
public class ThreadTest 
{

	public static void main(String[] args)
	{
      Mythread t=new Mythread();
      t.start();
     
     t.interrupt();
      for(int i=1;i<=10;i++)
      {
    	  System.out.println("main thread");
      }
	}

}
