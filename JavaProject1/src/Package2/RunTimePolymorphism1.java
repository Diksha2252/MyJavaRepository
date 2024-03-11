package Package2;

public class RunTimePolymorphism1 {

	public void method1(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum is "+sum);
		
	}
	public void method1(int a, int b, int c)
	{
		int mul = a*b*c;
		System.out.println("mul is "+mul);
		
	}
}
