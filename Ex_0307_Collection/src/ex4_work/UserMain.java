
package ex4_work;

import java.util.*;

public class UserMain {
	public static void main(String[] args) {
//		������ id�� pw�� ������ UserInfo Ŭ������ �����
//		MainŬ�������� ������ ������ ArrayList�� �߰��Ͽ� ����϶�
//		������ ������� ���̵� ���� ��� "id�� �ߺ��˴ϴ�."���
//		����ϰ� ó������ ���ư���
		
//		���̵� ����: aaa
//		�н����� �Է�: 1234
//		aaa
//		1234
//		---------------------
//		���̵� ����: bbb
//		�н����� �Է�: 5678
//		aaa
//		1234
//		------------------
//		bbb
//		5678
//		-------------------
//		���̵� ����: aaa
//		���̵� �ߺ�
		
		ArrayList<UserInfo> user = new ArrayList<UserInfo>();
		Scanner sc = new Scanner(System.in);
		
//		e: while (true) {
//			System.out.print("���̵� ����: ");
//			String uid = sc.next();
//			
//			if (uid.equals("exit")) {
//				break;
//			}
//			
//			System.out.print("�н����� �Է�: ");
//			int upw = sc.nextInt();
//			UserInfo ui = new UserInfo();
//			
//			for (int i = 0; i < user.size(); i++) {
//				if (ui.getId().equals(user.get(i).getId())) {
//					System.out.println("�ߺ��� ���̵�");
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
			UserInfo ui = new UserInfo(); //while�� �� ������ ���ο� UserInfo��ü ����
			
			System.out.println("���̵� ����: ");
			ui.setId(sc.next());
			
			for (int i = 0; i < user.size(); i++) {
				if (ui.getId().equals(user.get(i).getId())) {
					System.out.println("�ߺ��� ���̵�");
					continue e;
				}
			}
			
			System.out.println("��й�ȣ ����: ");
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
