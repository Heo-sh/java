package ex1_net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1_InetAddress {
	public static void main(String[] args) {
//		InetAddress
//		- 자바에서 ip주소를 다루기 위한 클래스로 InetAddress를 제공

		InetAddress ip = null;

		try {
			ip = InetAddress.getByName("www.naver.com");
//			getByName(): 정적 메서드

			System.out.println(ip.getHostName());
//			getHostName(): 도메인을 반환

			System.out.println(ip.getHostAddress());
//			getHostAddress(): 도메인의 ip주소를 문자열 형태로 반환

			byte[] ipaddr = ip.getAddress();
			System.out.println(Arrays.toString(ipaddr));

			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
//			getAllByName(): 도메인이 운영하는 모든 서버(ip) 주소를 배열에 담아 변환

			for (int i = 0; i < iparr.length; i++) {
				System.out.println(iparr[i]);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
