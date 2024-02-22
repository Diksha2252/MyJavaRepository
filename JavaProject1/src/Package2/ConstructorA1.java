package Package2;

public class ConstructorA1 {

	public ConstructorA1()
	{
		this(1,2,3);
		System.out.println("This is Parent default consturctor");
		
	}
	public ConstructorA1(int a)
	{
		this();
		System.out.println("This is Parent one parameterized consturctor");
		
	}
	public ConstructorA1(int a, int b)
	{
		this(10);
		System.out.println("This is Parent two parameterized consturctor");
		
	}
	
	public ConstructorA1(int a, int b, int c)
	{
		
		System.out.println("This is Parent three parameterized consturctor");
		
	}
	
}
