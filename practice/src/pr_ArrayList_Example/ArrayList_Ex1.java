package pr_ArrayList_Example;

import java.util.*;

public class ArrayList_Ex1 {
	
//	������ �̸��� �Է¹޾� ArrayList�� �ְ�
//	�ű⼭ �达 ���� ���� ����� �� ������ ���
	
	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int person = 0;
			System.out.print("��� �̸��� �Է��ϼ���: ");
			namelist.add(sc.next());
			
			for (String name : namelist) {
				System.out.print(name + " ");
			}
			System.out.println();
			
			for (int i = 0; i < namelist.size(); i++) {
				String first = namelist.get(i);
				if (first.startsWith("��")) {
					person++;
				}
			}
			System.out.printf("�达 ���� ���� ����� %d���Դϴ�.", person);
			System.out.println();
		}
	}
}
