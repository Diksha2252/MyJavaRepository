package Package2;

public class StarLogic8 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i+=2)
			{
			for(int j=i;j<=n;j+=2)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			}

	}

}
