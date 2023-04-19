package Ex2_function;

import java.util.*;
import java.util.function.Function;

public class Ex4_function {
	public static void main(String[] args) {
//		Function의 합성
//		- Function 인터페이스 -> R apply(T t);
//		- 두 람다식을 합성해서 새로운 람다식을 만들 수 있다.
//		- f.andThen(g) - 함수 f를 먼저 적용하고 그 다음에 함수 g를 적용한다.
//		- f.compose(g) - g를 먼저 적용하고 f를 적용한다.
//		- Function.identity() - 함수를 적용하기 이전과 동일한 항등함수, x -> x f.andThen(g)
		
//		- f.andThen(g)
//		Function<String, Integer> f = s -> Integer.parseInt(s, 16); //받은 문자열을 16진수의 정수로 변환
//		Function<Integer, String> g = i -> Integer.toBinaryString(i); //받은 정수를 2진수 문자열로 변환
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF") + 2);

//		- f.compose(g)
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
//		Function<Integer, Integer> h = f.compose(g);
//		System.out.println(h.apply(2)); //2진수 -> "10" 16진수 -> 16

		Function<String, String> f = x -> x; // 항등함수
//		Function<String, String> f = Function.identity(); //위의 코드와 같다
		System.out.println(f.apply("hello"));

	}
}
