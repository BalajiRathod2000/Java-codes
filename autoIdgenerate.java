package autoIdgenerate;


class autoId
{
	
	 static int Id ;
	 String Name;
	 int age;
	 
	static
	 {
		  Id=456;
		 
	 }
	 
	 {
		 Id= ++Id + Id++;
	 }
	 
	public autoId( String Name,int age)
	{
		
		this.Name=Name;
		this.age=age;
	}
	
	public void StudentDisplay()
	{
		System.out.println(" Id = " +Id);
		System.out.println(" Name = " +Name);
		System.out.println(" Age = " +age);
		System.out.println(" =================================");
	}
	
	public autoId( String Name, autoId s)
	{
		
		this.Name=Name;
		this.age=s.age;
	}
	
	public autoId( autoId b, int age)
	{
		
		this.Name=b.Name;
		this.age=age;
	}
	
	public autoId( autoId s, autoId b)
	{
		
		this.Name=s.Name;
		this.age=b.age;
		
	}
	
}

//"========================================================================================================="

public class autoIdgenerate 
{

	public static void main(String[] args) 
	{
		autoId s1=new autoId("Krishna", 25);
				s1.StudentDisplay();
				
		autoId s2=new autoId("Radha", 22);
				s2.StudentDisplay();
				
		autoId s3=new autoId ("Ram ", s1);
				s3.StudentDisplay();
				
		autoId s4=new autoId(s2,s3);
				s4.StudentDisplay();
				
		autoId s5=new autoId( "Siya",24);
				s5.StudentDisplay();
				
		autoId s6=new autoId("Pavan", 25);
				s6.StudentDisplay();
		
				
				
	}

}
