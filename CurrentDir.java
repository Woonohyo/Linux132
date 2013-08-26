import java.io.File;

public class CurrentDir {
	public static void main(String[] args) {
		File f = new File("./");
		System.out.println(f.getAbsolutePath());
	}
}

