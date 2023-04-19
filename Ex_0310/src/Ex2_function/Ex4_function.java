package Ex2_function;

import java.util.*;
import java.util.function.Function;

public class Ex4_function {
	public static void main(String[] args) {
//		Function�� �ռ�
//		- Function �������̽� -> R apply(T t);
//		- �� ���ٽ��� �ռ��ؼ� ���ο� ���ٽ��� ���� �� �ִ�.
//		- f.andThen(g) - �Լ� f�� ���� �����ϰ� �� ������ �Լ� g�� �����Ѵ�.
//		- f.compose(g) - g�� ���� �����ϰ� f�� �����Ѵ�.
//		- Function.identity() - �Լ��� �����ϱ� ������ ������ �׵��Լ�, x -> x f.andThen(g)
		
//		- f.andThen(g)
//		Function<String, Integer> f = s -> Integer.parseInt(s, 16); //���� ���ڿ��� 16������ ������ ��ȯ
//		Function<Integer, String> g = i -> Integer.toBinaryString(i); //���� ������ 2���� ���ڿ��� ��ȯ
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF") + 2);

//		- f.compose(g)
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
//		Function<Integer, Integer> h = f.compose(g);
//		System.out.println(h.apply(2)); //2���� -> "10" 16���� -> 16

		Function<String, String> f = x -> x; // �׵��Լ�
//		Function<String, String> f = Function.identity(); //���� �ڵ�� ����
		System.out.println(f.apply("hello"));

	}
}
