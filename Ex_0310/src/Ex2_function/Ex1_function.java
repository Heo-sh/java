package Ex2_function;

import java.util.*;

public class Ex1_function {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
//		list �ȿ� ��� �ִ� ��� ����
//		list.remove();
//		removeIf();
//		- ���ǿ� �´� true ���� �����ϰ�, false�� ��ȯ�Ѵ�.
		list.removeIf(t -> t % 2 == 0); //Ȧ��(false)�� ��ȯ, ¦���� (true)
		
		list.forEach(System.out::println);
	}
}
