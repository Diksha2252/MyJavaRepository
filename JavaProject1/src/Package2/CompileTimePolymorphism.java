package Package2;

public class CompileTimePolymorphism {

	public void method1(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum is "+sum );
	}
	public void method1(int a, int b, int c)
	{
		int mul = a*b*c;
		System.out.println("mul is "+mul);
	}
	public static void main(String[] args) {
		CompileTimePolymorphism c = new CompileTimePolymorphism();
		c.method1(10, 20, 3);
		

	}

}
