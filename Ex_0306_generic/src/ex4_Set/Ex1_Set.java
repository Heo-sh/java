package ex4_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
//		�÷���(collection)
//		- java.util��Ű���� �ִ� �������̽� -> �߻� �޼��尡 �� �ִ�.
//		- �迭�� ������ �����Ͽ� index������ �������� ���� �ټ��� ��ü��
//		     �ٷ�� ���� ����ϴ� ���α׷��� ���
//		- ��Ҹ� �߰��ϴ� ���� ������ ����
		
//		- ����
//		- 1. Set
//		- 2. Map: List �������� ���δ�.
//		- 3. List: ���� ���� ���δ�.
		
//		Set �������̽��� �����ϰ� �ִ� Ŭ����
//		- HashSet, TreeSet
		
//		Set���� �������� �߻�޼��尡 �������̵�(������)�� �� �Ǿ� �ִ�.
		HashSet<String> hs1 = new HashSet<String>();
		
//		set�� �����͸� �߰��ϴ� ��
//		- �ε��� ��ȣ�� ���⿡ ���������� �߰��� �ǳ�,
//		     ������ �͵��� ������ �Ǿ �߰��ȴ�.
//		- for���� ���� �ϳ��ϳ� ����� �Ұ��ϴ�.
		hs1.add("a");
		hs1.add("e");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		hs1.add("c");
		
//		HashSet�� ����ִ� ����� ������ ���� �޼���
		System.out.println("hs1�� ����� ����: " + hs1.size());
		
//		HashSet�� �ߺ��� �����͸� �߰��� �� ����.
		System.out.println(hs1.add("a")); //false ��� - �̹� �ִ� ���� �߰��ϱ⿡
		hs1.add("b");

		System.out.println("hs1�� ����� ����: " + hs1.size());
		
//		HashSet�� ����Ǿ� �ִ� �ϳ��� �����͸� �����ϴ� ��
		hs1.remove("a");
		
//		HashSet ���
		System.out.println(hs1);

//		HashSet�� ����Ǿ� �ִ� ��� �����͸� �����ϴ� ��
		hs1.removeAll(hs1); //����� �������� ��ȯ���ش�.
		hs1.clear(); //�����ϰ� ��ȯ�ϴ� ���� ����.
		System.out.println(hs1);
		
		System.out.println("-----------------");
		
//		HashSet ��ü hs2�� ����� 1~45������ ���� 6���� ��ҷ� �־ ����ϱ�
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
//		while (true) {
//			int n = new Random().nextInt(45)+1;
//			
//			hs2.add(n);
//			
//			if (n != n) {
//				hs2.add(n);				
//			} else if (hs2.size() == 6) {
//				break;
//			}
//		}
//		
//		System.out.println(hs2);
		
		while (hs2.size() < 6) {
			int rnd = new Random().nextInt(45) + 1;
			hs2.add(rnd);
		}
		
		System.out.println(hs2);
		
//		index�� ���⿡ ��� �ϳ��ϳ��� ������ �� �� ����
//		Set -> �迭�� ��ȯ
		
//		Integer[0] --> �迭�� ���� ������ 0���� ������ Set�� add�ص� ����� ������ŭ
//		�˾Ƽ� ���� ������ش�.
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
