package calculator;

import java.util.*;

public class Calculator6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
//		향상된 포문
//		for (String name : list) {
//			System.out.print(name + ", ");
//		}
		
//		forEach()로 출력
//		- consumer: 추상메서드를 가진 람다식에 사용하기 위한 FunctionalInterface;
//		- FunctionalInterface에 있는 accept(T)를 파라미터로 사용한다.
//		- 모든 자료형을 대입 가능하다. -> 제네릭 메서드로 정의하면 매개변수나 반환 타입이 달라도 문제 X
		list.forEach(x -> System.out.print(x + ", "));
		System.out.println();
		list.forEach(System.out::println);
		
	}
}
