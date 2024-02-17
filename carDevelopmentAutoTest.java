package autoIdgenerate;

class Car
{
	
	public void start() 
	{
		
	}
	
	public void accelerate()
	{
		
	}
	
	public void stop()
	{
		
	}
}

// =========================================================================================================

class Audi extends Car
{
	
	public void Start()
	{
		
		System.out.println(" Key Start...");
	}
	
	public void accelerate()
	{
		
		System.out.println(" half clutch ");
		
	}
	
	public void stop()
	{
		
		System.out.println(" key Stop");
		
	}
}

// ======================================================================================================

class BMW extends Car
{
	
	public void Start()
	{
		
		System.out.println(" Button Start...");
		
	}
	
	public void accelerate()
	{
		
		System.out.println(" full clutch ");
		
	}
	
	public void stop()
	{
		
		System.out.println(" Button Stop");
		
	}
}

// ====================================================================================================

class Tesla extends Car
{
	public void Start()
	{
		
		System.out.println(" Biometic Start");
		
	}
	
	public void accelerate()
	{
		
		System.out.println(" Automatic run..");
		
	}
	
	public void stop()
	{
		
		System.out.println(" Biometric Stop");
		
	}
}

// =============================================================================================

class Driver
{
	public void driveCar(Car car)
	{
		
		car.start();
		car.accelerate();
		car.stop();
				           								  
	}
	 
}

// ===================================================================================================

public class carDevelopmentAutoTest 
{

	public static void main(String[] args) 
	{
		Driver d=new Driver();
		d.driveCar(new Audi());
		d.driveCar(new BMW());
		
		System.out.println(" ==============================================");
		
	    Car a=new Audi();
		a.start();
		a.accelerate();
		a.stop();
		
		System.out.println(" ==============================================");
		
		Car b=new BMW();
		b.start();
		b.accelerate();
		b.stop();
		
		System.out.println(" ==============================================");
		
		Car c=new Car();
		c.start();
		c.accelerate();
		c.stop();
		
	}

}
