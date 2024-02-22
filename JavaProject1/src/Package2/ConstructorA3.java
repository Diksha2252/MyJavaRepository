package Package2;

public class ConstructorA3 {
	public ConstructorA3()
	{
		this(10,20);
		System.out.println("This is Parent default consturctor");
		
	}
	public ConstructorA3(int a)
	{
		this(10,20,30);
		System.out.println("This is Parent one parameterized consturctor");
		
	}
	public ConstructorA3(int a, int b)
	{
		
		System.out.println("This is Parent two parameterized consturctor");
		
	}
	
	public ConstructorA3(int a, int b, int c)
	{
		this();
		System.out.println("This is Parent three parameterized consturctor");
		
	}
}
