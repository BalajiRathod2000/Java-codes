package autoIdgenerate;

class Bike
{
	
}

// =============================================================================================

class KTM extends Bike
{
	
}

//=============================================================================================

class A
{
	public void m1(Bike b)
	{
		System.out.println(" Super Bike ");
	}
	
	public void m2(KTM k)
	{
		System.out.println(" KTM bike.. ");
	}
}

//=============================================================================================

class B extends A
{
	public void m1(Bike b)
	{
		System.out.println(" normal Bike ");
	}
	
	public void m2(KTM k)
	{
		System.out.println(" Duke bike.. ");
	}
}

//=============================================================================================

public class bindingTest 
{

	public static void main(String[] args) 
	{
		
		 A a1 = new B();   // object created to B class and Store in reference of A class...
		 
		 Bike b=new KTM(); // object created to KTM class and Store in reference of BIke class...
		 a1.m1(b);
	
	}

}
