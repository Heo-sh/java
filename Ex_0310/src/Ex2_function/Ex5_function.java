package Ex2_function;

import java.util.function.Predicate;

public class Ex5_function {
	public static void main(String[] args) {
//		Predicate�� ����
//		- Predicate �������̽� -> boolean Test(T t);
//		- Predicate�� and(), or(), negate()�� �����ؼ� �ϳ��� ���ο� Predicate�� ������ �� �ִ�.
//		- Predicate�� ���� negate()�� ���̸� ���ǽ� ��ü�� ������ �ȴ�.
//		- static �޼����� isEqual()�� �� ����� ���ϴ� Predicate�� ���鶧 ����Ѵ�.
		
		Predicate<Integer> p = i -> i < 100; 
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = p.and(q);
		
//		�����̶�� �Ѵ�.
		System.out.println(r.test(150)); //false
		System.out.println(r.test(99)); //true
		
		Predicate<Integer> s = p.or(q);
//		�����̶�� �Ѵ�.
		System.out.println(s.test(101)); //true
		
		Predicate<Integer> notP = p.negate(); // i >= 100;
		System.out.println("p.test(100): " + p.test(100)); //false
		System.out.println("notP.test(100): " + notP.test(100)); //true
		
	}
}
