package Ex2_function;

import java.util.function.Predicate;

public class Ex5_function {
	public static void main(String[] args) {
//		Predicate의 결합
//		- Predicate 인터페이스 -> boolean Test(T t);
//		- Predicate를 and(), or(), negate()로 연결해서 하나의 새로운 Predicate로 결합할 수 있다.
//		- Predicate의 끝에 negate()를 붙이면 조건식 전체가 부정이 된다.
//		- static 메서드인 isEqual()은 두 대상을 비교하는 Predicate를 만들때 사용한다.
		
		Predicate<Integer> p = i -> i < 100; 
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = p.and(q);
		
//		논리곱이라고 한다.
		System.out.println(r.test(150)); //false
		System.out.println(r.test(99)); //true
		
		Predicate<Integer> s = p.or(q);
//		논리합이라고 한다.
		System.out.println(s.test(101)); //true
		
		Predicate<Integer> notP = p.negate(); // i >= 100;
		System.out.println("p.test(100): " + p.test(100)); //false
		System.out.println("notP.test(100): " + notP.test(100)); //true
		
	}
}
