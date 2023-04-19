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
//			BufferedReader: Character 기반  Stream
			
			while((line = input.readLine()) != null) {
//				input.read()의 반환형이 String이라 null값을 준다. -1이 들어올 수 없기에
				System.out.println(line);
//				네이버 홈페이지를 이루는 html의 정보를 가져온다.
			}
			
			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
