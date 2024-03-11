package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Take the rowno from the user and data of that row only will read.
public class Assignment1 {

	public void readParticularData(int rowNo) throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String s;
		int l = 0;
		while((s=br.readLine())!=null)
		{
			l=l+1;
			if(l==rowNo)
			{
				System.out.println(s);
				break;
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		Assignment1 a=new Assignment1();
		a.readParticularData(3);

	}

}
