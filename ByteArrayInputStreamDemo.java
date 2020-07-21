package IO_Package;
import java.io.*;
public class ByteArrayInputStreamDemo {
	public static void main(String args[])
	{
		String tmp = "asddfghjjkklmnbvccxz";
		byte b[]= tmp.getBytes();
		ByteArrayInputStream input = new ByteArrayInputStream(b);
		ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
		
	}

}
