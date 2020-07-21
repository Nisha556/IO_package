package IO_Package;
import java.io.File;
public class FileDemo {
	static void p(String s)
	{
		System.out.println(s);
		
	}
	public static void main(String args[])
	{
		File f1 = new File("/home/nisha/IO_prog");
		p("Fole Name :" +f1.getName());
		p("Path : " +f1.getAbsolutePath());
		p("Parent : " +f1.getParent());
		p(f1.exists() ? "exists" : "does not exists");
		p(f1.canWrite() ? "is writable" : "does not writable");
		p(f1.canRead() ? "is readable" : "does not readable");
		p(f1.isFile() ? "is normal file" : "might be a named pipe");
		p(f1.isAbsolute() ? "is absolute" : "is not absolute");
		p("File last modified: " + f1.lastModified());
		p("File size: " + f1.length() + " Bytes");
		
	}

}
