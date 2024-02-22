package Package2;

public class ConstructorA4 extends ConstructorA3 {

	public ConstructorA4()
	{
		this(10);
		System.out.println("This is Child default parameterized consturctor");
		
	}
	public ConstructorA4(int a)
	{
		this(10, 20);
		System.out.println("This is Child one parameterized consturctor");
		
	}
	public ConstructorA4(int a, int b )
	{
		super(10);
		System.out.println("This is Child two parameterized consturctor");
		
	}
	public ConstructorA4(int a, int b, int c)
	{
		this();
		System.out.println("This is Child three parameterized consturctor");
		
	}
	public static void main(String[] args) {
		ConstructorA4 obj=new ConstructorA4(10,20,30);

	}

}
