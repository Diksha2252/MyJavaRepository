package Package2;

public class ConstructorA2 extends ConstructorA1{

	public ConstructorA2()
	{
		super(10, 20);
		System.out.println("This is Child default parameterized consturctor");
		
	}
	public ConstructorA2(int a)
	{
		this(10, 20, 30);
		System.out.println("This is Child one parameterized consturctor");
		
	}
	public ConstructorA2(int a, int b )
	{
		this();
		System.out.println("This is Child two parameterized consturctor");
		
	}
	public ConstructorA2(int a, int b, int c)
	{
		this(10, 20);
		System.out.println("This is Child three parameterized consturctor");
		
	}
	public static void main(String[] args) {
		ConstructorA2 obj=new ConstructorA2(10);

	}

}
