package IO_Package;
import java.io.*;
public class FileReaderDemo {
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("IO_prog.java");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s= br.readLine()) != null) {
			System.out.println(s);
			
		}
		fr.close();
		
		
	}
	
		
	}


