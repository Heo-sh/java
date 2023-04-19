package ex1_TreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
//		TreeSet<Integer> ts = new TreeSet<Integer>(set1);
//		- set1�� ���� ��� ���� TreeSet���� ����
		
//		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(1, 2, 3));
//		- �ʱⰪ�� ���� TreeSet�� ����
		
//		TreeSet ��� �߰�
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		
//		TreeSet �� ����
		ts.remove(1); //�� 1 ����
		
//		TreeSet ��� �� ����
		ts.clear();
		
//		�ʱⰪ ���� �� TreeSet ����
		TreeSet<Integer> ts2 = new TreeSet<Integer>(Arrays.asList(7, 4, 9, 1, 5));
		
//		TreeSet ũ�� ���ϱ�
		int n = ts2.size();
		System.out.println("treeSet�� ũ��: " + n);
		
//		TreeSet �� ���
		System.out.println(ts2); //���ĵ� ���·� ���
		
		System.out.println("�ּҰ� ���: " + ts2.first());
		System.out.println("�ִ밪 ���: " + ts2.last());
		
//		���ǿ� �����ϴ� ���� ���ٸ� null���� ��ȯ
		System.out.println("�Է°����� ū ������ �� �ּҰ� ���: " + ts2.higher(10));
		System.out.println("�Է°����� ū ������ �� �ּҰ� ���: " + ts2.higher(3));
		System.out.println("�Է°����� ���� ������ �� �ִ밪 ���: " + ts2.lower(7));
		System.out.println("�Է°����� ���� ������ �� �ִ밪 ���: " + ts2.lower(0));
		
//		Example01
//		HashSet�� �̿��Ͽ� 5 * 5�� ���� ������ �����
		HashSet<Integer> hs = new HashSet<Integer>();
		int [][] board = new int [5][5];
		
		while (true) {
			hs.add(new Random().nextInt(50)+1);
			
			if (hs.size() == 25) {
				break;
			}
		}
		
//		Set������ Ư�� �ε����� ������ �� ���⿡ ������ ���������� ������ ���ؼ���
//		iterator��� �ݺ��ڸ� �̿��ؾ� �Ѵ�.
//		����: �÷����� ó������ ������ ���⿡ �߰��� �߰��� ��� �ִ� ���� �������⿡ ���� �ʴ�.
//		           �뷮�� �����Ϳ����� �ð��� ���� �ҿ䰡 �ȴ�.
				
//		Iterator<Integer> ���ͷ����͸� = �÷��ǰ�ü.iterator();
		Iterator<Integer> it = hs.iterator();
		
//		it.hasNext();
//		- iterator �ȿ� ���� ���� ��� �ִ��� Ȯ���Ͽ�
//		    ������ true, ������ false�� ��ȯ
		
//		it.next();
//		- iterator�� ���� �� ��ȯ
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
