package calculator;

public class Calculator {
//	메서드는 메서드 밖에서 만들 수 있고,
//	메서드 호출은 메서드 안에서 가능하다.
//	다른 클래스에서 만들어 main으로 가져와 사용했었다.
	
//	람다식
//	- 메서드의 이름과 반환값이 없어지므로, 익명함수라고도 한다.
//	- 메서드를 하나의 식(expression)으로 표현
//	- 자바 1.8버전에서 도입
//	- 도입된 이유: 함수형 프로그래밍 방식이 유행되면서
//		자바에서는 함수형 프로그래밍 방식이 적용되지 않았다.
//		자바에서 함수는 클래스를 나누어 작성했다.
//		-> 함수가 독립적이지 않다 -> 반드시 객체를 만들어 호출해야함
	
//	함수형 프로그래밍의 특징
//	- 함수를 파라미터(매개변수)에 넣어서 사용가능
//	- 함수를 반환형(return)에 넣어서 사용 가능
	
//	람다식 사용법
//	1. 인터페이스 1개 만든다.
//	2. 구현할 추상메서드 1개 정의
//		- 이름이 없는 익명 함수로 구현하기에 메서드가 여러 개 있다면
//		  어떤 메서드를 구현한 것인지 모호해 지므로 하나만 정의
//	3. 메서드는 1개만 정의해야함
//	4. 람다식을 이용하면서 가능한 부분은 최대한 생략하는 게 좋다
	
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		int result = calc.plus(20, 30);
		System.out.println(result);
	
	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
