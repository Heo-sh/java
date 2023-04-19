package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
//	http통신과 socket통신의 차이점
//	- 단방향 통신인 http통신은 Client의 요청(Request)이 있을 때만 서버가 응답(Response)하여 해당 정보를 전송하고 곧바로 연결을 종료하는 방식입니다.
//	  Client가 요청을 보내는 경우에만 Server가 응답하는 단방향 통신으로 반대로 Server가 Client에게 요청을 보낼수는 없습니다.
//
//	- 양방향 통신인 Socket통신 Server와 Client가 특정 Port(통로)를 통해 실시간으로 양방향 통신을 하는 방식입니다.
//	  Http통신과는 다르게 Server와 Client가 Port를 통해 연결되어 있어서 실시간으로 양방향 통신을 할 수 잇습니다.
//	  Streaming이나 실시간 채팅, 게임 등과 같이 즉각적으로 정보를 주고받는 경우에 사용됩니다.

//	Socket통신의 규칙
//	1. 먼저 기다리는 측을 Server라고 하며, Server에서는 Port를 열고 Client의 접속을 기다립니다.
//	2. 그리고 접속을 하는 측을 Client라고 하며, Server의 IP와 Port에 접속하여 통신이 연결됩니다.
//	3. Server와 Client 간의 통신은 Send, Receive의 형태로 주고받습니다.
//	4. 그리고 통신이 끝나면 close()로 접속을 끊습니다.
	
	ServerSocket ss;
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 시작");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //생성자
	
	public static void main(String[] args) {
		new MyServer();
	}
	
	@Override
	public void run() {
//		thread가 해야할 일
//		- 접속자를 받고, 문자열을 받아낸다.
		while (true) {
			try {
				Socket s = ss.accept();
				
//				클라이언트가 보낸 문자열
				BufferedReader reader = new BufferedReader(
							new InputStreamReader(s.getInputStream()));
				
//				접속자가 보낸 메세지
				String msg = reader.readLine();
				
//				접속자의 ip
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + msg);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} //while
	} //run
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
