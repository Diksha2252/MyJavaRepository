package Package2;

public class StarLogic5 {

	public static void main(String[] args) {
		int x=10;
		for(int i=1;i<=x;i+=2)
		{
			for(int j=1;j<=(x-i)/2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
