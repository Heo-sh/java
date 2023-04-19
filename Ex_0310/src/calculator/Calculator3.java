package calculator;

public class Calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
//		return 생략 가능
//		- 중괄호도 같이 생략해야 한다.
//		- 명령이 한 줄일 때만 가능
		MyCalculator calc2 = (int num1, int num2) -> num1 + num2;		
		
//		파라미터의 자료형 생략 가능
//		- 생략하려면 모든 파라미터의 자료형을 지워야 한다.
		MyCalculator calc3 = (num1, num2) -> num1 + num2;		
		
//		매개변수가 하나일 때 숫자를 출력해주는 람다식 작성
//		- 파라미터가 하나일 경우 소괄호도 생략 가능
		MyFunction func = (int num) -> { //파라미터
			System.out.println(num); //명령 or return
		};
		MyFunction mf = num -> System.out.println(num);
		
		//::(이중콜론): 메서드 참조 연산자
//		- 람다식을 보다 간결하게 사용할 수 있도록 해준다.
		MyFunction func2 = System.out::println;
		
		
		
		
		
		
		
	}
}
