package ex4_work;

import java.util.*;

public class Work {
	public static void main(String[] args) {
//		�Ʒ��� ����� �����ϼ���
//		���̵� ����: abc
//		abc
//		
//		���̵� ����: abc2
//		abc abc2
//		
//		���̵� ����: abc3
//		abc abc2 abc3
//		
//		���̵� ����: ...
//		...
		
//		�ߺ��� ���̵� �˻��ϴ� ���� �߰��ϱ�
		
		ArrayList<String> idlist = new ArrayList<String>();
		ArrayList<Integer> pwlist = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���̵� ����: ");
			String id = sc.next();
			
			if (id.equals("exit")) {
				break;
			} else if (idlist.contains(id)) { //�ߺ� id �˻� ����
				System.out.println("�����ϴ� id�Դϴ�.");
				continue;
			}
			
//			for (int i = 0; i < idlist.size(); i++) { //�ߺ� id �˻� ����
//				if (id.equals(idlist.get(i))) {
//					System.out.println("�ߺ��� id");
//					continue w;
//				}
//			}
			
			System.out.print("��й�ȣ ����: ");
			int pw = sc.nextInt();
						
			if (pwlist.contains(pw)) { //�ߺ��� pw �˻� ����
				System.out.println("�����ϴ� pw�Դϴ�.");
			} else if (!idlist.contains(id) && !pwlist.contains(pw)){
				idlist.add(id); //���̵� �߰�����
				pwlist.add(pw); //pw �߰�����
				
				for (int i = 0; i < idlist.size(); i++) {
					System.out.print(idlist.get(i) + " ");
				}
				System.out.println();
//				for (String str : idlist) {
//					System.out.println(str + " ");
//				}
				for (int num : pwlist) {
					System.out.print(num + " ");
				}
				System.out.println();				
			}
		}
		
	}
}
