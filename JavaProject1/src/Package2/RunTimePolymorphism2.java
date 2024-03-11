package Package2;

public class RunTimePolymorphism2 extends RunTimePolymorphism1{

	public void method1(int a1, int b1)
	{
		int sum = a1+b1;
		System.out.println("sum is: "+sum);
		
	}
	
	public static void main(String[] args) {
		RunTimePolymorphism2 r = new RunTimePolymorphism2();
		r.method1(10, 20);

	}

}
