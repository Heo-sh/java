package ex2_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {
//		id: aaa
//		pw: 1111
//		id�� �������� �ʽ��ϴ�.
//		
//		id: lee
//		pw: 3333
//		��й�ȣ ����ġ
//		
//		id: park
//		pw: 3333
//		�α��� ����
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("id: ");
			String id = sc.next();
			System.out.print("pw: ");
			int pw = sc.nextInt();
			
			if (!map.containsKey(id)) {
				System.out.println("id�� �������� �ʽ��ϴ�.");
			} else {
				if (map.get(id) != pw) {
					System.out.println("��й�ȣ ����ġ");
				} else {
					System.out.println("�α��� ����");
					break;
				}
			}
		}

	}
}