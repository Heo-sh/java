package ex2_stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
//		기본타입형 스트림
//		- 제네릭을 사용하지 않고 직접적으로 해당 타입의 스트림을 다룰 수 있다.
//		- 요소의 타입이 T인 스트림은 기본적으로 Stream인데, 기본자료형을
//		    다루려면 오토박싱 & 언박싱이 발생하여 비효율성이 증가한다.
//		  (Integer <-> int)
//		- 비효율성을 줄이기 위해 데이터 소스의 요소를 기본형으로 다루는 스트림이 제공된다.
//		  1. IntStream
//		  2. LongeStream
//		  3. DoubleStream
//		- 기본자료형에 유용하게 사용할 수 있는 메서드를 제공한다.
		
//		1 ~ 10까지 총합을 구하는 코드 작성해보기
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
//		range(시작값, 끝값): 시작값은 포함, 끝값은 미만
//		rangeClosed(시작값, 끝값): 시작값 포함, 끝값 포함
		int result = IntStream.range(1, 11).sum();
		System.out.println(result);
		
		System.out.println("---------------------");
		
//		IntStream ints(시작값, 종료값)
//		LongStream longs(시작값, 종료값)
//		DoubleStream longs(시작값, 종료값)
		
		Random rnd = new Random();
		IntStream stream = rnd.ints(1, 46); //범위 정하기
		stream.distinct().limit(6).forEach(System.out::println);

		System.out.println("---------------------");
		
//		두 스트림의 연결
//		concat()
		String[] str1 = {"123", "456", "789"};
		String[] str2 = {"abc", "def", "ghi"};
		
		Stream<String> stream1 = Stream.of(str1);
		Stream<String> stream2 = Stream.of(str2);
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		
		stream3.forEach(x -> System.out.print(x + " "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
