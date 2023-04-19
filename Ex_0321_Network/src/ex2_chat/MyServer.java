package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
//	http��Ű� socket����� ������
//	- �ܹ��� ����� http����� Client�� ��û(Request)�� ���� ���� ������ ����(Response)�Ͽ� �ش� ������ �����ϰ� ��ٷ� ������ �����ϴ� ����Դϴ�.
//	  Client�� ��û�� ������ ��쿡�� Server�� �����ϴ� �ܹ��� ������� �ݴ�� Server�� Client���� ��û�� �������� �����ϴ�.
//
//	- ����� ����� Socket��� Server�� Client�� Ư�� Port(���)�� ���� �ǽð����� ����� ����� �ϴ� ����Դϴ�.
//	  Http��Ű��� �ٸ��� Server�� Client�� Port�� ���� ����Ǿ� �־ �ǽð����� ����� ����� �� �� �ս��ϴ�.
//	  Streaming�̳� �ǽð� ä��, ���� ��� ���� �ﰢ������ ������ �ְ��޴� ��쿡 ���˴ϴ�.

//	Socket����� ��Ģ
//	1. ���� ��ٸ��� ���� Server��� �ϸ�, Server������ Port�� ���� Client�� ������ ��ٸ��ϴ�.
//	2. �׸��� ������ �ϴ� ���� Client��� �ϸ�, Server�� IP�� Port�� �����Ͽ� ����� ����˴ϴ�.
//	3. Server�� Client ���� ����� Send, Receive�� ���·� �ְ��޽��ϴ�.
//	4. �׸��� ����� ������ close()�� ������ �����ϴ�.
	
	ServerSocket ss;
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("���� ����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //������
	
	public static void main(String[] args) {
		new MyServer();
	}
	
	@Override
	public void run() {
//		thread�� �ؾ��� ��
//		- �����ڸ� �ް�, ���ڿ��� �޾Ƴ���.
		while (true) {
			try {
				Socket s = ss.accept();
				
//				Ŭ���̾�Ʈ�� ���� ���ڿ�
				BufferedReader reader = new BufferedReader(
							new InputStreamReader(s.getInputStream()));
				
//				�����ڰ� ���� �޼���
				String msg = reader.readLine();
				
//				�������� ip
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + msg);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} //while
	} //run
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}