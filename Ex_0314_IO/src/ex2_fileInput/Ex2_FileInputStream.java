package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\WEB15_LHJ\\java\\test.txt";
		
		File f = new File(path);
		
		//배열은 int범위까지만 만들 수 있다.
		byte[] read = new byte[(int)f.length()];
		
		//배열의 크기를 딱 맞춰서 메모리 낭비를 하지 않는게 가장 좋지만, 상황마다 다른 파일을
		//받는다면 용량을 알수가 없다.
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				
				fis.read(read);
				
				String res = new String(read);
				
				System.out.println(res);
				
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
