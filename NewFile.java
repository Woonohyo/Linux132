import java.io.*;
import java.util.*;

public class NewFile {
	static Random r = new Random();
	static final String PRE = "file_";
	static final String STR = 
		"This is file \n" +
		"Bye Bye~\n";

	public static void main(String[] args)
		throws IOException {
		String fname = PRE + r.nextInt(100);
		File f = new File("./", fname);
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		bos.write(STR.getBytes());
		bos.close();
		fos.close();
	}
}
