package person;

import java.util.*;

public class PersonManager { //����� ����ϴ� Ŭ����
	public void personMgr() {
		Scanner sc = new Scanner(System.in);
		int select;
		int count = 0;
		
		ArrayList<Person> pr = new ArrayList<Person>();
		Person p1 = new Person();
		
		a: while (true) {
			
			System.out.println("1. ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ��ü ����");
			System.out.println("4. ����");
			
			System.out.print("�׸� ����: ");
			select = sc.nextInt();
			
			switch (select) {
			case 1: // ���� �߰�
				
				System.out.println("----�����߰�----");
				System.out.print("�̸�: ");
				p1.setName(sc.next());
				System.out.print("����: ");
				p1.setAge(sc.nextInt());
				System.out.print("��ȭ: ");
				p1.setTel(sc.next());
				
				pr.add(p1);	

				for (int i = 0; i < pr.size(); i++) {
					if (pr.get(i).getName().equals(p1.getName())) {
						System.out.println("���� ����");
					}
				}
				
				break;
			case 2: // ���� ����
				
				System.out.print("������ �̸�: ");
				String delete = sc.next();
				
				for (int i = 0; i < pr.size(); i++) {
					if (pr.get(i).getName().equals(delete)) {
						pr.remove(i);
						if(!pr.contains(delete)) {
							System.out.printf("%s�� ������ �����߽��ϴ�.\n", delete);

						}
					} else {
						System.out.println("������ �����Ͱ� �����ϴ�.");
					}
				}
				break;
				
			case 3: // ��ü ����
				System.out.println("----��ü����----");
				for (int i = 0; i < pr.size(); i++) {
					count++;
				}
				System.out.printf("����ο� %d��", count);
				System.out.println();

				for (int i = 0; i < pr.size(); i++) {
					System.out.println("�̸�: " + pr.get(i).getName());
					System.out.println("����: " + pr.get(i).getAge());
					System.out.println("��ȭ: " + pr.get(i).getTel());
					System.out.println("--------");
				}
				count = 0;
				break;
				
			case 4: // ����
				break a;
				
			}
			
		}
		
	}
}
