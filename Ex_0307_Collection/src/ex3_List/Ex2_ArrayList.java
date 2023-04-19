package ex3_List;

import java.util.*; //java.util ��Ű���� �ִ� ��� ���� import�ϰڴ�.

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		index�� �����Ͽ� ���� �߰��ϱ�
//		- ArrayList��.add(index, element);
//		- ���������� ������ �� ���� �ƴ϶� ������ index�� ���������� �� ĭ �и��� �ȴ�. 
		list.add(10);
		list.add(10);
		list.add(1, 14);
		list.add(1, 20);
		
//		�ϳ��� ��ҿ� �����Ͽ� ���� ����
//		- ArrayList��.set(index, element);
		list.set(2, 30); //index 2���� ���� 30���� ����

		System.out.println(list);
		
//		ArrayList ��� ����
//		- ArrayList��.remove(index); �ش� index ���� ��Ҹ� ����
//		- �߰��� �ִ� ��Ҹ� �����ϸ� ������ index�� �������� ��ĭ�� �������.
		list.remove(1); //index 1�� ��� ����
		
//		ArrayList ����� �ε��� �� �˾Ƴ���
//		- ArrayList��.indexOf(o);
//		- �ߺ��� ���� ��� ���� ���� ������ ����� �ε����� ��ȯ
//		- �⺻���� Ž�� ������ ���ʿ��� ������
//		System.out.println("30�� index: " + list.indexOf(30));

//		- ArrayList��.lastIndexOf(o);
//		- �����ʿ��� �������� Ž���ϸ鼭 ���� ���� ������ ����� index�� ��ȯ
//		list.lastIndexOf(10);
		
		
//		ArrayList ��� ���� Ȯ��		
//		- ArrayList��.contains(o);
//		- ������ true, ������ false�� ��ȯ
		list.contains(30);
		
//		ArrayList ����: ��ü����
//		- ArrayList��.removeAll(ArrayList��);
//		- ArrayList��.clear();
		if (list.removeAll(list)) {
			System.out.println("list �����");
		}; //����  ��� -> if���� ���� �����ϴ�.
		list.clear();
		
//		ArrayList�� ������� Ȯ��
//		- ArrayList��.isEmpty();
//		- ����� ������ true, �ƴ϶�� false ��ȯ
		list.isEmpty();
		
		System.out.println(list);
		
	}
}
