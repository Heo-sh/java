package calculator;

import java.util.*;

public class Calculator6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�̸�1");
		list.add("�̸�2");
		list.add("�̸�3");
		list.add("�̸�4");
		list.add("�̸�5");
		list.add("�̸�6");
		
//		���� ����
//		for (String name : list) {
//			System.out.print(name + ", ");
//		}
		
//		forEach()�� ���
//		- consumer: �߻�޼��带 ���� ���ٽĿ� ����ϱ� ���� FunctionalInterface;
//		- FunctionalInterface�� �ִ� accept(T)�� �Ķ���ͷ� ����Ѵ�.
//		- ��� �ڷ����� ���� �����ϴ�. -> ���׸� �޼���� �����ϸ� �Ű������� ��ȯ Ÿ���� �޶� ���� X
		list.forEach(x -> System.out.print(x + ", "));
		System.out.println();
		list.forEach(System.out::println);
		
	}
}
