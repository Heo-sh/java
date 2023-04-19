
package ex4_work;

import java.util.*;

public class UserMain {
	public static void main(String[] args) {
//		유저의 id와 pw를 가지는 UserInfo 클래스를 만들고
//		Main클래스에서 유저의 정보를 ArrayList에 추가하여 출력하라
//		기존에 사용중인 아이디가 있을 경우 "id가 중복됩니다."라고
//		출력하고 처음으로 돌아가기
		
//		아이디 생성: aaa
//		패스워드 입력: 1234
//		aaa
//		1234
//		---------------------
//		아이디 생성: bbb
//		패스워드 입력: 5678
//		aaa
//		1234
//		------------------
//		bbb
//		5678
//		-------------------
//		아이디 생성: aaa
//		아이디 중복
		
		ArrayList<UserInfo> user = new ArrayList<UserInfo>();
		Scanner sc = new Scanner(System.in);
		
//		e: while (true) {
//			System.out.print("아이디 생성: ");
//			String uid = sc.next();
//			
//			if (uid.equals("exit")) {
//				break;
//			}
//			
//			System.out.print("패스워드 입력: ");
//			int upw = sc.nextInt();
//			UserInfo ui = new UserInfo();
//			
//			for (int i = 0; i < user.size(); i++) {
//				if (ui.getId().equals(user.get(i).getId())) {
//					System.out.println("중복된 아이디");
//					continue e;
//				}
//			}
//			
//			for (int i = 0; i < user.size(); i++) {
//				UserInfo ai = user.get(i);
//				System.out.println(ai.getId() + " ");
//				System.out.print(ai.getPw() + " ");
//				System.out.println();
//				System.out.println("---------------");
//			}			
//		}
		
		e: while (true) {
			UserInfo ui = new UserInfo(); //while을 돌 때마다 새로운 UserInfo객체 생성
			
			System.out.println("아이디 생성: ");
			ui.setId(sc.next());
			
			for (int i = 0; i < user.size(); i++) {
				if (ui.getId().equals(user.get(i).getId())) {
					System.out.println("중복된 아이디");
					continue e;
				}
			}
			
			System.out.println("비밀번호 생성: ");
			ui.setPw(sc.nextInt());
			
			user.add(ui);
			
			for (int i = 0; i < user.size(); i++) {
				UserInfo ai = user.get(i);
				System.out.println(ai.getId() + " ");
				System.out.print(ai.getPw() + " ");
				System.out.println();
				System.out.println("---------------");
			}
		}
		
	}
}
