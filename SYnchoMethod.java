package autoIdgenerate;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(5000);
				System.out.println("good morning dhoni");
			}
		catch(Exception e)
		{
			
		}
			System.out.println(name);
		}
	}
}
class Myread extends Thread
{
	Display d;
	String name;
	public Myread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class SYnchoMethod 
{

	public static void main(String[] args)
	{
      Display d=new Display();
      Display d1=new Display();
      Myread t1=new Myread(d,"Dhoni");
      Myread t2=new Myread(d1,"Raina");
      t1.start();
      t2.start();
      
	}

}
