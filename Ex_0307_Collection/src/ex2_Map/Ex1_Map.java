package ex2_Map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
//		Map
//		- Ű(Key)�� ��(Value)�� �� ���� �����ͷ� ����
//		- Key ���� ���� Value ���� �˻��ϱ⿡ ���� ���� �����͸�
//		    ��ȸ�ϴ� �� �վ �ſ� �پ ������ �����Ѵ�.
//		- Map�� �������̽��̸�, �����ϴ� Ŭ���� �� ���� ���Ǵ� Ŭ������
//		  HashMap�̴�.
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
//		HashMap�� ��� �߰�
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
//		Map�� ����Ǵ� Value���� �ߺ��� �� �� �ִ�.
//		- ���� Key������ �߰��� �ϸ� ���Ӱ� �߰��� �ȴ�.
		map.put(4, 'A');
		
//		Map�� ����Ǵ� Key���� �ߺ� �ȵȴ�.
//		- ������ ���� �̸��� ���� Key�� �ִٸ� Value�� �����Ѵ�.
		map.put(1, 'F');		
		
//		HashMap�� ũ��
		System.out.println("map�� ũ��: " + map.size());

//		HashMap ��� ����
//		- �ߺ����� �ʴ� Key���� �̿��Ͽ� ��� ����
		map.remove(3);
		
//		HashMap ���
		System.out.println(map);
		
//		HashMap value�� ���
//		- Key���� ���� Value���� �����´�.
		char ch = map.get(1);
		System.out.println("map.get(1): " + ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
