package Ex2_function;

import java.util.*;

public class Ex1_function {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
//		list 안에 들어 있는 요소 제거
//		list.remove();
//		removeIf();
//		- 조건에 맞는 true 값을 제거하고, false를 반환한다.
		list.removeIf(t -> t % 2 == 0); //홀수(false)만 반환, 짝수는 (true)
		
		list.forEach(System.out::println);
	}
}
