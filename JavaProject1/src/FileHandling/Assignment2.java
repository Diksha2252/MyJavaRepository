package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2 {

	public void readParticularData(int initial, int end) throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String s;
		int l = 0;
		while((s=br.readLine())!=null)
		{
			l=l+1;
			if((l>=initial)&&(l<=end))
			{
				System.out.println(s);	
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		Assignment2 a=new Assignment2();
		a.readParticularData(3,5);

	}

}
