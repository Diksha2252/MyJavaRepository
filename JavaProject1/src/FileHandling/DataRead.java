package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataRead {

	public void readDataCharByChar() throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
	}
	
	public void readDataLineByLine() throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) throws IOException {
		DataRead d=new DataRead();
		d.readDataLineByLine();

	}

}
