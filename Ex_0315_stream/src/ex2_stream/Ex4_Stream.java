package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4_Stream {
	public static void main(String[] args) {
//		stream의 최종연산
//		- 최종연산은 스트림의 요소를 소모하기 때문에 결과를 반환 후
//		최종 연산 후에 스트림이 닫히게 되고 더 이상 사용할 수 없다.
		
//		forEach()
//		- 반환타입이 void이므로 스트림의 요소를 출력하는 용도
		
//		조건검사
//		1. allMatch(): 지정된 조건에 모든 요소가 일치하면 true
//		2. anyMatch(): 지정된 조건에 일부 요소가 일치하면 true
//		3. noneMatch(): 지정된 조건에 어떠한 요소도 일치하지 않으면 true
//		- 1, 2, 3번은 boolean이 반환형이므로 반환해줄 변수를 boolean으로 사용해야 한다.
//		4. findFirst(): 지정된 조건에 일치하는 첫 번째 요소 반환
//		5. findAny(): 지정된 조건에 일치하는 첫 번째 요소 반환
		
		int[] intArr = {2, 4, 6};
		
		boolean result = Arrays.stream(intArr).allMatch(x -> x % 2 == 0);
		System.out.println("2의 배수 ?: " + result); //true
		
		result = Arrays.stream(intArr).anyMatch(x -> x % 3 == 0);
		System.out.println("3의 배수가 하나라도 있는가?: " + result); //true
		
		result = Arrays.stream(intArr).noneMatch(x -> x % 3 == 0);
		System.out.println("3의 배수가 하나도 없는가?: " + result); //false		
		
		Stream.of("one", "two", "three")
			.filter(x -> x.length() > 4)
			.findFirst()
			.ifPresent(System.out::println);
		
//		통계
//		- count(), sum(), average(), max(), min()
//		- IntStream과 같은 기본형 스트림에스는 스트림의 요소들에 대한 통계를
//		    얻을 수 있는 메서드들이 있다.
//		- 기본형 스트림이 아닌 경우에는 통계 관련 메서드가 3개만 있다.(count(), max(), min())
		
//		reduce()
//		- 스트림의 요소를 줄여나가면서 연산을 수행, 최종결과를 반환한다.
//		- 매개변수 타입은 BinaryOperator이며, BinaryOperator는
//		  BiFunction의 하위 인터페이스다.
//		- 처음 두 요소를 가지고 연산한 결과를 가지고 그 다음 요소와 연산이 가능하다.
		
//		스트림을 컬렉션이나 배열로 변환
//		- toList()
//		- toSet()
//		- toMap()
//		- toCollection()
//		- toArray()
//		- 최종연산이기에 맨 마지막에 붙인다.
		
	}
}
