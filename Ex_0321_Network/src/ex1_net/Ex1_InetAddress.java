package ex1_net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1_InetAddress {
	public static void main(String[] args) {
//		InetAddress
//		- �ڹٿ��� ip�ּҸ� �ٷ�� ���� Ŭ������ InetAddress�� ����

		InetAddress ip = null;

		try {
			ip = InetAddress.getByName("www.naver.com");
//			getByName(): ���� �޼���

			System.out.println(ip.getHostName());
//			getHostName(): �������� ��ȯ

			System.out.println(ip.getHostAddress());
//			getHostAddress(): �������� ip�ּҸ� ���ڿ� ���·� ��ȯ

			byte[] ipaddr = ip.getAddress();
			System.out.println(Arrays.toString(ipaddr));

			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
//			getAllByName(): �������� ��ϴ� ��� ����(ip) �ּҸ� �迭�� ��� ��ȯ

			for (int i = 0; i < iparr.length; i++) {
				System.out.println(iparr[i]);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
