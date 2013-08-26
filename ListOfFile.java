import java.io.File;

public class ListOfFile {
	static final int MAX = 512;

	public static void main(String[] args) {
		File f = new File("./"); //현재 디렉토리의 파일 출력을 위해
								 // ../ -> ./ 으로 변경
		String[] astr = new String[MAX];
		if(f.isDirectory()) {
			astr = f.list();
		} else {
			System.err.printf("%s is not dir", f.getName());
			System.exit(1);
		}
		for (String s: astr)
			System.out.println(s);
	}
}

