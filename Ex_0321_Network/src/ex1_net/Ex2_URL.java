package ex1_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
//		�� URL(Uniform Resource Location)
//		URL�� �����ݿ� �����ϴ� ���� �������� �����ϴ� �ڿ��� ������ �� �ִ� �ּҸ� ǥ���ϱ� ���� ������
//		��������://ȣ��Ʈ��:��Ʈ��ȣ/��θ�/���ϸ�?������Ʈ��#������ ���·� �̷���� �ִ�.
//		�� �������� ȣ��Ʈ�� ���Եȴ�.

//		URL Ex)
//		http://dm.n-mk.kr:80/board/list.html?referer=kim#index1
//			�������� - �ڿ��� �����ϱ� ���� ������ ����ϴµ� ���Ǵ� ��űԿ�(http)
//			ȣ��Ʈ�� - �ڿ��� �����ϴ� ������ �̸�(dm.n-mk.kr)
//			��Ʈ��ȣ - ��ſ��� ���Ǵ� ������ ��Ʈ��ȣ(80)
//			��θ� - �����Ϸ��� �ڿ��� ����� �������� ��ġ(/board/)
//			���ϸ� - �����Ϸ��� �ڿ��� �̸�(list.html)
//			������Ʈ��(query) - URL���� '?'������ �κ�(referer=kim)
//			����(anchor) - URL���� '#'������ �κ�(index1)

		try {
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index1");

			System.out.println(url.getAuthority());
//			getAuthority(): ȣ��Ʈ��� ��Ʈ�� ���ڿ� ���·� ��ȯ

			System.out.println(url.getPort());
//			getPort(): ��Ʈ��ȣ�� ���������� ��ȯ

			System.out.println(url.getHost());
//			getHost(): ȣ��Ʈ���� ���ڿ��� ��ȯ

			System.out.println(url.getProtocol());
//			getProtocol(): ���������� ���ڿ��� ��ȯ

			System.out.println(url.getQuery());
//			getQuery(): ������ ���ڿ��� ��ȯ

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		URLConnection
//		- URLConnection�� ���ø����̼ǰ� URL���� ��ſ����� ��Ÿ���� Ŭ������ �ֻ��� Ŭ������ �߻�Ŭ���� 
//		- URLConnection�� ��ӹ޾� ������ Ŭ�����δ� HttpURLConnection�� JarURLConnection�� ������,
//		- URL�� ���������� http ���������̶�� openConnection()�� HttpURLConnection�� ��ȯ�Ѵ�.
//		- URLConnection�� ����ؼ� �����ϰ��� �ϴ� �ڿ��� �����ϰ� �а� ���⸦ �� �� �ִ�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
