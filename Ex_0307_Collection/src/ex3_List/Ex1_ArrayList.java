package ex3_List;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
//		ArrayList
//		- List�� �÷��� �������̽� �� ���� ���� ���δ�.
//		- C����� LinkedList���� �Ѿ�� ���信�� ������ �����ؼ� ���� �����̴�.
//		- index���� ���� ���� �߰��ϰų� �����ϴ� �뵵�� Ŭ����
//		- �ߺ��� ���� �������� �ʰ� �߰�
//		- �١١� index ��ȣ�� ������ �ִ�.
//		- �迭�� ũ�Ⱑ �������߸� ������ ArrayList������ size��
//		    �þ��� �پ��� �������̴�.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		ArrayList ��� �߰�
		list.add(100);
		list.add(100);
		list.add(20);
		System.out.println(list);
		
//		ArrayList ũ��
//		- ArrayList��.size();
//		- ũ��� �ε��� ������ ��ȣ�� �ٸ���.
//		- ũ�� -1 == �ε��� ������ ��ȣ
		int ls = list.size();
		System.out.println("list�� size: " + ls);
		
//		ArrayList Ư�� ��� ��������
//		- ArrayList��.get();
		System.out.println("list.get(2): " + list.get(2));
		
//		for���� ����Ͽ� ArrayList�� ���� ��� ��ҿ� �����ϱ�
//		- �迭���� �ٸ��� get�� ���� �����ؾ��Ѵ�.
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
//		������ for��(������ roop��: for-each��)
//		- �迭, list�� ���� ������ index������ �ڵ����� �����Ͽ� ��Ҹ� ���
//		- Ư�� index�� �������� ������ �Ұ��ϱ⿡ Ư�� index�� ���� �����̳�
//		    ��� �Ұ����ϴ�.
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}
