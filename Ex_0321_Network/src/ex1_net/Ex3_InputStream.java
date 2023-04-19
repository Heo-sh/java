package ex1_net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex3_InputStream {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			String line = "";
			
			BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//			BufferedReader: Character ���  Stream
			
			while((line = input.readLine()) != null) {
//				input.read()�� ��ȯ���� String�̶� null���� �ش�. -1�� ���� �� ���⿡
				System.out.println(line);
//				���̹� Ȩ�������� �̷�� html�� ������ �����´�.
			}
			
			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
