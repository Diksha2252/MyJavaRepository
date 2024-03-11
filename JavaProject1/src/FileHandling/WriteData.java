package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public void writeData() throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Welcome home");
		fw.close();
	}
	
	public void writeDataLineByLine() throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter br=new BufferedWriter(fw);
		br.write("Welcome home");
		br.newLine();
		br.write("Home sweet home");
		br.close();
	}
	
	public void writeDataAppend() throws IOException
	{
		File f=new File("../JavaProject1/FileHandlingFile.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter br=new BufferedWriter(fw);
		br.newLine();
		br.write("Third line");
		br.newLine();
		br.write("Fourth Line");
		br.close();
	}
	public static void main(String[] args) throws IOException {
		WriteData wd=new WriteData();
		wd.writeDataAppend();

	}

}
