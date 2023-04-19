package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4_Stream {
	public static void main(String[] args) {
//		stream�� ��������
//		- ���������� ��Ʈ���� ��Ҹ� �Ҹ��ϱ� ������ ����� ��ȯ ��
//		���� ���� �Ŀ� ��Ʈ���� ������ �ǰ� �� �̻� ����� �� ����.
		
//		forEach()
//		- ��ȯŸ���� void�̹Ƿ� ��Ʈ���� ��Ҹ� ����ϴ� �뵵
		
//		���ǰ˻�
//		1. allMatch(): ������ ���ǿ� ��� ��Ұ� ��ġ�ϸ� true
//		2. anyMatch(): ������ ���ǿ� �Ϻ� ��Ұ� ��ġ�ϸ� true
//		3. noneMatch(): ������ ���ǿ� ��� ��ҵ� ��ġ���� ������ true
//		- 1, 2, 3���� boolean�� ��ȯ���̹Ƿ� ��ȯ���� ������ boolean���� ����ؾ� �Ѵ�.
//		4. findFirst(): ������ ���ǿ� ��ġ�ϴ� ù ��° ��� ��ȯ
//		5. findAny(): ������ ���ǿ� ��ġ�ϴ� ù ��° ��� ��ȯ
		
		int[] intArr = {2, 4, 6};
		
		boolean result = Arrays.stream(intArr).allMatch(x -> x % 2 == 0);
		System.out.println("2�� ��� ?: " + result); //true
		
		result = Arrays.stream(intArr).anyMatch(x -> x % 3 == 0);
		System.out.println("3�� ����� �ϳ��� �ִ°�?: " + result); //true
		
		result = Arrays.stream(intArr).noneMatch(x -> x % 3 == 0);
		System.out.println("3�� ����� �ϳ��� ���°�?: " + result); //false		
		
		Stream.of("one", "two", "three")
			.filter(x -> x.length() > 4)
			.findFirst()
			.ifPresent(System.out::println);
		
//		���
//		- count(), sum(), average(), max(), min()
//		- IntStream�� ���� �⺻�� ��Ʈ�������� ��Ʈ���� ��ҵ鿡 ���� ��踦
//		    ���� �� �ִ� �޼������ �ִ�.
//		- �⺻�� ��Ʈ���� �ƴ� ��쿡�� ��� ���� �޼��尡 3���� �ִ�.(count(), max(), min())
		
//		reduce()
//		- ��Ʈ���� ��Ҹ� �ٿ������鼭 ������ ����, ��������� ��ȯ�Ѵ�.
//		- �Ű����� Ÿ���� BinaryOperator�̸�, BinaryOperator��
//		  BiFunction�� ���� �������̽���.
//		- ó�� �� ��Ҹ� ������ ������ ����� ������ �� ���� ��ҿ� ������ �����ϴ�.
		
//		��Ʈ���� �÷����̳� �迭�� ��ȯ
//		- toList()
//		- toSet()
//		- toMap()
//		- toCollection()
//		- toArray()
//		- ���������̱⿡ �� �������� ���δ�.
		
	}
}
