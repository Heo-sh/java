package ex3_fileout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutputStream {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\WEB15_LHJ\\java\\fileOut.html",true);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			fos.write('\n');
			
			String msg = "fileOutput�����Դϴ�.<br>";
			String msg2 = "�����ٵ� ����<br>";
			
			//getBytes() : ���ڿ��� byte[]�迭�� ��ȯ�ϴ� �޼���
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
	}
}
